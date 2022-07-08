package com.et.pedidos.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table( name = "productos" )
public class Producto implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column( name = "producto_id" )
    private Long productoId;

    @Column( name = "codigo_producto", unique = true )
    private String codigoProducto;

    @Column( name = "nombre_producto" )
    private String nombreProducto;

    @OneToMany( mappedBy="producto" )
    Set<ProductoCliente> productoClientes;

    public Set<ProductoCliente> getProductoClientes() {
        return productoClientes;
    }

    public void setProductoClientes(Set<ProductoCliente> productoClientes) {
        this.productoClientes = productoClientes;
    }

    private String color;

    private String descripcion;

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
