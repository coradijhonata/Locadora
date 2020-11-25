package com.example.demo.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_filme")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Nome precisa ser preenchido.")
    @Column(length = 50)
    private String nome;

    @NotBlank(message = "Diretor precisa ser preenchido.")
    @Column(length = 20)
    private String diretor;

    @NotBlank(message = "Ano de lançamento não pode estar em branco.")
    @Digits(integer = 4, fraction = 0)
    private int ano_lancamento;

    @AssertTrue
    private boolean is_lancamento;

    @NotBlank(message = "Quantidade de volumes disponiveis não pode estar em branco.")
    @Digits(integer = 10, fraction = 0)
    private int qtd_volumes_disponiveis;

    @NotNull(message = "Genero precisa ser preenchido.")
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private GeneroFilme generoFilme;

}
