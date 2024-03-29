/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.matakuliah.service;

import com.dion.matakuliah.entity.Matakuliah;
import com.dion.matakuliah.repository.MatakuliahRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class MatakuliahService {
    private MatakuliahRepository matakuliahRepository;
    
    @Autowired

    public MatakuliahService(MatakuliahRepository matakuliahRepository) {
        this.matakuliahRepository = matakuliahRepository;
    }
    
    
    public List<Matakuliah> getAll(){
        return matakuliahRepository.findAll();
    }
    
    public void insert(Matakuliah matakuliah){
        Optional<Matakuliah> matakuliahOptional = matakuliahRepository.findMatakuliahByKode(matakuliah.getKode());
        if(matakuliahOptional.isPresent()){
            throw new IllegalStateException("Kode sudah ada");
        }
        matakuliahRepository.save(matakuliah);
    }
}
