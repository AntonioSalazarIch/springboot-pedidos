package com.et.pedidos.dao;

import com.et.pedidos.entidad.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDireccionDao extends JpaRepository<Direccion, Long> {
}
