package com.et.pedidos.implementacion;

import com.et.pedidos.dao.IProveedorDao;
import com.et.pedidos.entidad.Proveedor;
import com.et.pedidos.interfaz.IProveedorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorImpl implements IProveedorServicio {

    @Autowired
    IProveedorDao proveedorDao;

    @Override
    public List<Proveedor> findAll() {
        return proveedorDao.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        return proveedorDao.findById( id ).orElse( null );
    }
}
