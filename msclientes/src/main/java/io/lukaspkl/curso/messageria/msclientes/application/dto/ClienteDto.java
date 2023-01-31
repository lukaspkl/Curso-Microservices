package io.lukaspkl.curso.messageria.msclientes.application.dto;

import io.lukaspkl.curso.messageria.msclientes.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDto {

    String cpf;
    String nome;
    Integer idade;

    public Cliente clienteDto(){
        return  new Cliente(cpf,nome,idade);
    }
}
