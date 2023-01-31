package io.lukaspkl.curso.messageria.msclientes.application;

import io.lukaspkl.curso.messageria.msclientes.domain.Cliente;
import io.lukaspkl.curso.messageria.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClientesController {

    private final ClienteRepository clientebanco;
    private final ClienteService clienteService;



    @PostMapping
    @ResponseStatus(CREATED)
    public Cliente salvar (@RequestBody Cliente cliente){
        return clientebanco.save(cliente);
    }


    @GetMapping(params = "cpf")
    public Cliente obterCPF (@RequestParam("cpf") String cpf){
        return clientebanco
                .findByCpf(cpf)
                .orElseThrow(()-> new ResponseStatusException(NOT_FOUND,"Cliente nao encontrado."));
    }
}
