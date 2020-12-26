package com.example.demo.domain.entities;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_locacao")
public class Locacao implements Persistable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "tb_locacao_id_seq", sequenceName = "tb_locacao_id_seq", allocationSize = 1)
    private Long id;

    @NotBlank(message = "id_locacao não pode estar vazio")
    @Column(name = "id_locacao_principal")
    private Long idLocacaoPrincipal;

    @NotNull(message = "id_filme não pode estar vazio")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_filme", foreignKey = @ForeignKey(name = "tb_locacao_filme_fkey"))
    private Filme filme;

    @NotNull(message = "id_cliente não pode estar vazio")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tb_cliente", foreignKey = @ForeignKey(name = "tb_locacao_cliente_fkey"))
    private Cliente cliente;

    @NotBlank(message = "dt_locacao não pode estar vazio")
    @Column(length = 10)
    @Pattern(regexp = "\\d{2}\\/\\d{2}\\/\\d{4}]", message = "Data precisa estar no formato dd/MM/yyyy")
    private Date dtLocacao;

    @NotBlank(message = "dt_devolucao não pode estar vazio")
    @Column(length = 10)
    @Pattern(regexp = "\\d{2}\\/\\d{2}\\/\\d{4}]", message = "Data precisa estar no formato dd/MM/yyyy")
    private Date dtDevolucao;

    @NotBlank(message = "status_locacao não pode estar vazio")
    @Column(length = 10)
    @Enumerated(EnumType.STRING)
    private StatusLocacao statusLocacao;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_locacao_principal", columnDefinition = "tb_locacao_pkey", foreignKey = @ForeignKey(name = "tb_locacao_id_locacao_principal_fkey"))
    private Set<Locacao> locacoes = new HashSet<>();

}