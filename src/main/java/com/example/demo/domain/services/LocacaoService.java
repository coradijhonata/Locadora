package com.example.demo.domain.services;

import com.example.demo.domain.dtos.LocacaoDTO;
import com.example.demo.domain.gateways.LocacaoGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.REQUIRED)
@RequiredArgsConstructor
public class LocacaoService {

    private LocacaoGateway locacaoGateway;

    public boolean isEmpty() {
        return false;
    }

    public Long count() {
        try {
            return locacaoGateway.count();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public LocacaoDTO findById(Long id) {
        try {
            return locacaoGateway.findById(id);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public List<LocacaoDTO> findAll() {
        try {
            return locacaoGateway.findAll();
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public LocacaoDTO save(LocacaoDTO locacaoDTO) {
        try {
            return locacaoGateway.save(locacaoDTO);
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public LocacaoDTO update(Long id, LocacaoDTO locacaoDTO) {
        try {
            return null;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void delete(long id) {
        locacaoGateway.delete(id);
    }

}