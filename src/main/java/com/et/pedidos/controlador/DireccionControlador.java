package com.et.pedidos.controlador;

import com.et.pedidos.entidad.Direccion;
import com.et.pedidos.interfaz.IDireccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping( value = "/api/direcciones" )
public class DireccionControlador {

    @Autowired
    IDireccionServicio direccionServicio;

    @GetMapping( "/todos" )
    public ResponseEntity<?> findAll(){
        Map<String, Object> respuesta = new HashMap<>();
        List<Direccion> direcciones = direccionServicio.findAll();
        if( !direcciones.isEmpty() ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", direcciones );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existen direcciones" );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }

    @GetMapping( "/id/{id}" )
    public ResponseEntity<?> findById(@PathVariable Long id ){
        Map<String, Object> respuesta = new HashMap<>();
        Direccion direccion = direccionServicio.findById( id );
        if( direccion != null ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", direccion );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existe el direccion " + id );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }

}
