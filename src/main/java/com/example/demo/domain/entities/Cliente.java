package com.example.demo.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_cliente")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150)
    @NotBlank(message = "Nome precisa ser preenchido")
    @Size(min = 2, max = 150, message = "minimo de 2 caracteres, maximo de 150 caracteres para o nome")
    private String nome;

    @NotBlank(message = "CPF precisa ser preenchido.")
    @Column(length = 11)
    @Size(min = 11, message = "cpf precisa ter 11 digitos")
    private String cpf;

    @NotNull(message = "Sexo precisa ser preenchido.")
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private GeneroCliente sexo;

    @NotBlank(message = "telefone precisa ser preenchido.")
    @Column(length = 20)
    @Size(min = 8, message = "telefone precisa ter no minimo 8 digitos")
    private String telefone;

    @NotBlank(message = "Email precisa ser preenchido.")
    @Email(message = "E-mail precisa ser válido.")
    @Column(length = 100)
    private String email;

}