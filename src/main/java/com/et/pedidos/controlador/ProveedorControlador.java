package com.et.pedidos.controlador;

import com.et.pedidos.entidad.Proveedor;
import com.et.pedidos.interfaz.IProveedorServicio;
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
@RequestMapping( value = "/api/proveedores" )
public class ProveedorControlador {

    @Autowired
    IProveedorServicio proveedorServicio;

    @GetMapping( "/todos" )
    public ResponseEntity<?> findAll(){
        Map<String, Object> respuesta = new HashMap<>();
        List<Proveedor> proveedores = proveedorServicio.findAll();
        if( !proveedores.isEmpty() ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", proveedores );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existen proveedores" );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }

    @GetMapping( "/id/{id}" )
    public ResponseEntity<?> findById(@PathVariable Long id ){
        Map<String, Object> respuesta = new HashMap<>();
        Proveedor proveedor = proveedorServicio.findById( id );
        if( proveedor != null ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", proveedor );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existe el proveedor " + id );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }
}
