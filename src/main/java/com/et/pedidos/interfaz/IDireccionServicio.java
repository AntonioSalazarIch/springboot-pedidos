package com.et.pedidos.interfaz;

import com.et.pedidos.entidad.Direccion;

import java.util.List;

public interface IDireccionServicio {

    public List<Direccion> findAll();

    public Direccion findById( Long id );
}
