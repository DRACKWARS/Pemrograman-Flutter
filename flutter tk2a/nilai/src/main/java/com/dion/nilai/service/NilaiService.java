package com.dion.nilai.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.dion.nilai.entity.Nilai;
import com.dion.nilai.repository.NilaiRepository;

@Service
public class NilaiService {
    private NilaiRepository nilaiRepository;

    public NilaiService(NilaiRepository nilaiRepository) {
        this.nilaiRepository = nilaiRepository;
    }

    public List<Nilai> getAll(){
        return nilaiRepository.findAll();
    }

    public void insert(Nilai nilai){
        Optional<Nilai> nilaiOptional = nilaiRepository.findNilaiById(nilai.getId());
        if(nilaiOptional.isPresent()){
            throw new IllegalStateException("Id sudah ada");
        }
        nilaiRepository.save(nilai);
    }
    
}
