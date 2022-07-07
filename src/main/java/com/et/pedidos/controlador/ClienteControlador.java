package com.et.pedidos.controlador;

import com.et.pedidos.entidad.Cliente;
import com.et.pedidos.interfaz.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping( value = "/api/clientes" )
public class ClienteControlador {

    @Autowired
    IClienteServicio clienteServicio;

    @GetMapping( "/todos" )
    public ResponseEntity<?> findAll(){
        Map<String, Object> respuesta = new HashMap<>();
        List<Cliente> clientes = clienteServicio.findAll();
            if( !clientes.isEmpty() ){
                respuesta.put( "mensaje", "OK" );
                respuesta.put( "data", clientes );
            } else{
                respuesta.put( "mensaje", "SIN REGISTROS" );
                respuesta.put( "data", "no existen clientes" );
            }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }

    @GetMapping( "/id/{id}" )
    public ResponseEntity<?> findById(@PathVariable Long id ){
        Map<String, Object> respuesta = new HashMap<>();
        Cliente cliente = clienteServicio.findById( id );
        if( cliente != null ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", cliente );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existe el cliente " + id );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }
}
