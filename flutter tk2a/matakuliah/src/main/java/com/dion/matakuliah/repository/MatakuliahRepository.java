/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dion.matakuliah.repository;

import com.dion.matakuliah.entity.Matakuliah;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface MatakuliahRepository extends JpaRepository<Matakuliah, Long>{
    public Optional<Matakuliah> findMatakuliahByKode(String kode);
}
