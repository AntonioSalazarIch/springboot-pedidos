package com.et.pedidos.dao;

import com.et.pedidos.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
}
