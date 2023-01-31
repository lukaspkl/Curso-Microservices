package io.lukaspkl.curso.messageria.msclientes.application;

import io.lukaspkl.curso.messageria.msclientes.domain.Cliente;
import io.lukaspkl.curso.messageria.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente save (Cliente cliente){
       return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getByCPF (String cpf){
       return clienteRepository.findByCpf(cpf);
    }
}
