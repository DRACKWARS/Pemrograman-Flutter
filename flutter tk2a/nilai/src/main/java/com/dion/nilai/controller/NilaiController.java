package com.dion.nilai.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dion.nilai.entity.Nilai;
import com.dion.nilai.service.NilaiService;

    @RestController
    @RequestMapping("api/v1/nilai")
    public class NilaiController {
        @Autowired
        private NilaiService nilaiService;

        @GetMapping
        public List<Nilai> getAll(){
            return nilaiService.getAll();
        }

        @PostMapping
        public void insert(@RequestBody Nilai nilai){
            nilaiService.insert(nilai);
        }
    }
