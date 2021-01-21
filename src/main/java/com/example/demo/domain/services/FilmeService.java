package com.example.demo.domain.services;

import com.example.demo.domain.dtos.FilmeDTO;
import com.example.demo.domain.gateways.FilmeGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
@RequiredArgsConstructor
public class FilmeService {

    private FilmeGateway filmeGateway;

    public boolean isEmpty() {
        return false;
    }

    public Long count() {
        try {
            return filmeGateway.count();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public FilmeDTO findById(Long id) {
        try {
            return filmeGateway.findById(id);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<FilmeDTO> findAll() {
        try {
            return filmeGateway.findAll();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public FilmeDTO save(FilmeDTO filmeDTO) {
        try {
            return filmeGateway.save(filmeDTO);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public FilmeDTO update(Long id, FilmeDTO filmeDTO) {
        return null;
    }

    public void delete(Long id) {
        filmeGateway.delete(id);
    }

}
