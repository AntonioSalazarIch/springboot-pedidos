package com.et.pedidos.dao;

import com.et.pedidos.entidad.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProveedorDao extends JpaRepository<Proveedor, Long> {
}
