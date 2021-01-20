package io.github.JessicaMedeiros.clientes.model.repository;

import io.github.JessicaMedeiros.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {

}
