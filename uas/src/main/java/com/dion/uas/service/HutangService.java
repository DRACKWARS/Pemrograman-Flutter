/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.uas.service;
import com.dion.repository.HutangRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public class HutangService {
    
        private final HutangRepository hutangRepository;
        
    @Autowired
    public HutangService(HutangRepository hutangRepository) {
        this.hutangRepository = hutangRepository;
    }
    public List<Hutang
        > getAll() {
        return hutangRepository.findAll();
    }
    public Hutang getHutangByid(Long id) {
        return hutang Repository.findById(id).get();
    }

}
