package net.sytes.scarranaro.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.sytes.scarranaro.clientes.model.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {

}
