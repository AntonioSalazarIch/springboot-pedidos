package com.et.pedidos.entidad;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table( name = "proveedores" )
public class Proveedor implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column( name = "nit_proveedor", unique = true )
    private String nitProveedor;

    @Column( name = "nombre_proveedor" )
    private String nombreProveedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(String nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }
}
