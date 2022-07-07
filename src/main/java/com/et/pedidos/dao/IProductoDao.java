package com.et.pedidos.dao;

import com.et.pedidos.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDao extends JpaRepository<Producto, Long> {
}
