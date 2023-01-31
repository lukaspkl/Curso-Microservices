package io.lukaspkl.curso.messageria.msclientes.application;

import io.lukaspkl.curso.messageria.msclientes.domain.Cliente;
import io.lukaspkl.curso.messageria.msclientes.infra.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

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
    public ResponseEntity dadosCliente(@RequestParam("cpf") String cpf){
        var cliente = clienteService.getByCPF(cpf);
        if(cliente.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(cliente);
    }
}
