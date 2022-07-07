package com.et.pedidos.implementacion;

import com.et.pedidos.dao.IProductoDao;
import com.et.pedidos.entidad.Producto;
import com.et.pedidos.interfaz.IProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoImpl implements IProductoServicio {

    @Autowired
    IProductoDao productoDao;
    @Override
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    public Producto findById(Long id) {
        return productoDao.findById( id ).orElse( null );
    }
}
