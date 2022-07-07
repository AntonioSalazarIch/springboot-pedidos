package com.et.pedidos.interfaz;

import com.et.pedidos.entidad.Proveedor;

import java.util.List;

public interface IProveedorServicio {

    public List<Proveedor> findAll();

    public Proveedor findById( Long id );
}
