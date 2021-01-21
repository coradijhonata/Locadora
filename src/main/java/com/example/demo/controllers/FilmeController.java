package com.example.demo.controllers;

import com.example.demo.domain.dtos.FilmeDTO;
import com.example.demo.domain.services.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public List<FilmeDTO> listarFilmes() {
        return filmeService.findAll();
    }

    @GetMapping("/id")
    public FilmeDTO buscarFilme(@PathVariable Long id) {
        return filmeService.findById(id);
    }

    @PostMapping
    public FilmeDTO inserirFilme(@RequestBody FilmeDTO filmeDTO) {
        return filmeService.save(filmeDTO);
    }

    @DeleteMapping("/{id}")
    public void excluirFilme(@PathVariable Long id) {
        filmeService.delete(id);
    }

    @PutMapping
    public FilmeDTO editarFilme(@RequestBody FilmeDTO filmeDTO) {
        return filmeService.save(filmeDTO);
    }
}