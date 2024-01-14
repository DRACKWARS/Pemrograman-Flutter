/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dion.mahasiswa.repository;
import com.dion.mahasiswa.entity.Mahasiswa;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */


@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {

    Optional<Mahasiswa> findMahasiswaByEmail(String email);
    Optional<Mahasiswa> findMahasiswaById(Long id);
    
}

