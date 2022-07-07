package com.et.pedidos.interfaz;

import com.et.pedidos.entidad.Producto;

import java.util.List;

public interface IProductoServicio {

    public List<Producto> findAll();

    public Producto findById( Long id );
}
