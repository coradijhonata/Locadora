package com.example.demo.controllers;

import com.example.demo.domain.dtos.LocacaoDTO;
import com.example.demo.domain.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

    @Autowired
    private LocacaoService locacaoService;

    @GetMapping
    public List<LocacaoDTO> listarLocacoes() {
        return locacaoService.findAll();
    }

    @GetMapping("/id")
    public LocacaoDTO buscarLocacao(@PathVariable Long id) {
        return locacaoService.findById(id);
    }

    @PostMapping
    public LocacaoDTO inserirLocacao(@RequestBody LocacaoDTO locacaoDTO) {
        return locacaoService.save(locacaoDTO);
    }

    @DeleteMapping("/{id}")
    public void excluirLocacao(@PathVariable Long id) {
        locacaoService.delete(id);
    }

    @PutMapping
    public LocacaoDTO editarLocacao(@RequestBody LocacaoDTO locacaoDTO) {
        return locacaoService.save(locacaoDTO);
    }

}
