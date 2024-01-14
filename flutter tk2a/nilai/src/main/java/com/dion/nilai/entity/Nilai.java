package com.dion.nilai.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class Nilai {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idmahasiswa;
    private Long idmatakuliah;
    private Double nilai;
    
    public Nilai() {
    }

    public Nilai(Long id, Long idmahasiswa, Long idmatakuliah, Double nilai) {
        this.id = id;
        this.idmahasiswa = idmahasiswa;
        this.idmatakuliah = idmatakuliah;
        this.nilai = nilai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdmahasiswa() {
        return idmahasiswa;
    }

    public void setIdmahasiswa(Long idmahasiswa) {
        this.idmahasiswa = idmahasiswa;
    }

    public Long getIdmatakuliah() {
        return idmatakuliah;
    }

    public void setIdmatakuliah(Long idmatakuliah) {
        this.idmatakuliah = idmatakuliah;
    }

    public Double getNilai() {
        return nilai;
    }

    public void setNilai(Double nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString(){
        return "nilai{" + "id=" + id + ", id mahasiswa=" + idmahasiswa + ", id matakuliah=" + idmatakuliah + ", Nilai" + nilai+'}';
    }
}
