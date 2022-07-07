package com.et.pedidos.controlador;

import com.et.pedidos.entidad.Cliente;
import com.et.pedidos.entidad.Producto;
import com.et.pedidos.interfaz.IClienteServicio;
import com.et.pedidos.interfaz.IProductoServicio;
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
@RequestMapping( value = "/api/productos" )
public class ProductoControlador {

    @Autowired
    IProductoServicio productoServicio;

    @GetMapping( "/todos" )
    public ResponseEntity<?> findAll(){
        Map<String, Object> respuesta = new HashMap<>();
        List<Producto> productos = productoServicio.findAll();
        if( !productos.isEmpty() ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", productos );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existen productos" );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }

    @GetMapping( "/id/{id}" )
    public ResponseEntity<?> findById(@PathVariable Long id ){
        Map<String, Object> respuesta = new HashMap<>();
        Producto producto = productoServicio.findById( id );
        if( producto != null ){
            respuesta.put( "mensaje", "OK" );
            respuesta.put( "data", producto );
        } else{
            respuesta.put( "mensaje", "SIN REGISTROS" );
            respuesta.put( "data", "no existe el producto " + id );
        }
        return new ResponseEntity<Map<String, Object>>( respuesta, HttpStatus.OK);
    }
}
