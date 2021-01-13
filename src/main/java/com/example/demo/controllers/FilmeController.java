package com.example.demo.controllers;


import com.example.demo.dataprovider.entities.Filme;
import com.example.demo.dataprovider.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @GetMapping
    public List<Filme> listarFilmes() {
        List<Filme> filmes = filmeRepository.findAll();
        return filmes;
    }

    @GetMapping("/id")
    public Filme buscarFilme(@PathVariable Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);
        Filme filmeResultado = filme.get();
        return filmeResultado;
    }

    @PostMapping
    public Filme inserirFilme(@RequestBody Filme filme) {
        Filme filmeSalvo = filmeRepository.save(filme);
        return filmeSalvo;
    }

    @DeleteMapping("/{id}")
    public Optional<Filme> excluirFilme(@PathVariable Long id) {
        Optional<Filme> filme = filmeRepository.findById(id);
        filmeRepository.delete(filme.get());
        return filme;
    }

    @PutMapping
    public Filme editarFilme(@RequestBody Filme filme) {
        Filme filmeEditado = filmeRepository.save(filme);
        return filmeEditado;
    }


}
