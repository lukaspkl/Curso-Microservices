package io.lukaspkl.curso.messageria.msclientes.infra.repository;

import io.lukaspkl.curso.messageria.msclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Optional<Cliente> findByCpf(String cpf);
}
