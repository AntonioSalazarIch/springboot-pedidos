package com.et.pedidos.implementacion;

import com.et.pedidos.dao.IDireccionDao;
import com.et.pedidos.entidad.Direccion;
import com.et.pedidos.interfaz.IDireccionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DireccionImpl implements IDireccionServicio {

    @Autowired
    IDireccionDao direccionDao;
    @Override
    public List<Direccion> findAll() {
        return direccionDao.findAll();
    }

    @Override
    public Direccion findById(Long id) {
        return direccionDao.findById( id ).orElse( null );
    }
}
