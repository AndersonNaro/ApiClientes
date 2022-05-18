package net.sytes.scarranaro.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sytes.scarranaro.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
