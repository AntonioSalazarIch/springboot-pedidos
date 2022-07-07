package com.et.pedidos.interfaz;

import com.et.pedidos.entidad.Cliente;

import java.util.List;

public interface IClienteServicio {

    public List<Cliente> findAll();

    public Cliente findById( Long id );
}
