package com.example.demo.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tb_locacao")
public class Locacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "id_locacao não pode estar vazio")
    @Column()
    private long id_locacao_principal;

    @NotNull(message = "id_filme não pode estar vazio")
    @ManyToMany
    @JoinColumn(name = "tb_filme_pkey")
    private Filme filme;

    @NotNull(message = "id_cliente não pode estar vazio")
    @ManyToOne
    @JoinColumn(name = "tb_clientes_pkey")
    private Cliente cliente;

    @NotBlank(message = "dt_locacao não pode estar vazio")
    @Column(length = 10)
    @Pattern(regexp = "\\d{2}\\/\\d{2}\\/\\d{4}]", message = "Data precisa estar no formato dd/MM/yyyy")
    private Date dt_locacao;

    @NotBlank(message = "dt_devolucao não pode estar vazio")
    @Column(length = 10)
    @Pattern(regexp = "\\d{2}\\/\\d{2}\\/\\d{4}]", message = "Data precisa estar no formato dd/MM/yyyy")
    private Date dt_devolucao;

    @NotBlank(message = "status_locacao não pode estar vazio")
    @Column(length = 10)
    private String status_locacao;
}