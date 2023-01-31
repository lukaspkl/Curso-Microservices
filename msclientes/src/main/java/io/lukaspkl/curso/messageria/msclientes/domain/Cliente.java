package io.lukaspkl.curso.messageria.msclientes.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,length = 11)
    private String cpf;
    @Column(nullable = false,length = 150)
    private String nome;
    private Integer idade;

    public Cliente( String cpf, String nome, Integer idade) {

        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
}
