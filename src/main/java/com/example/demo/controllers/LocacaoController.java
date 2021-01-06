package com.example.demo.controllers;


import com.example.demo.domain.entities.Locacao;
import com.example.demo.domain.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    private LocacaoRepository locacaoRepository;

    @GetMapping
    public List<Locacao> listarLocacoes() {
        List<Locacao> locacoes = locacaoRepository.findAll();
        return locacoes;
    }

    @GetMapping("/id")
    public Locacao buscarLocacao(@PathVariable Long idPrincipalLocacao) {
        Optional<Locacao> locacoes = locacaoRepository.findById(idPrincipalLocacao);
        Locacao locacaoResultado = locacoes.get();
        return locacaoResultado;
    }

    @PostMapping
    public Locacao inserirLocacao(@RequestBody Locacao locacao) {
        Locacao locacaoSalva = locacaoRepository.save(locacao);
        return locacaoSalva;
    }

    @DeleteMapping("/{id}")
    public Optional<Locacao> excluirLocacao(@PathVariable Long id) {
        Optional<Locacao> locacao = locacaoRepository.findById(id);
        locacaoRepository.delete(locacao.get());
        return locacao;

    }

    @PutMapping
    public Locacao editarLocacao(@RequestBody Locacao locacao) {
        Locacao locacaoEditada = locacaoRepository.save(locacao);
        return locacaoEditada;
    }

}
