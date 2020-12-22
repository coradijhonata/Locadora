package com.example.demo.services;

import com.example.demo.domain.entities.Locacao;
import com.example.demo.repositories.LocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocacaoService {

    @Autowired
    LocacaoRepository locacaoRepository;

    public List<Locacao> listarLocacao(LocacaoRepository locacaoRepository) {
        return (List<Locacao>) locacaoRepository.findAll();
    }

    public Optional<Locacao> pegarLocacaoId(int id) {
        return locacaoRepository.findById(id);
    }

    public void deletarLocacao(int id) {
        locacaoRepository.deleteById(id);
    }
}
