package com.et.pedidos.implementacion;

import com.et.pedidos.dao.IClienteDao;
import com.et.pedidos.entidad.Cliente;
import com.et.pedidos.interfaz.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClienteImpl implements IClienteServicio {

    @Autowired
    IClienteDao clienteDao;

    @Transactional( readOnly = true )
    @Override
    public List<Cliente> findAll() {

        return clienteDao.findAll();
    }

    @Transactional( readOnly = true )
    @Override
    public Cliente findById(Long id) {
        return clienteDao.findById(id).orElse(null);
    }
}
