/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dion.uas.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/**
 *
 * @author ASUS
 */
public class Hutang {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idNasabah;
    private Double jumlahHutang;
    private Integer lama;
    private Double bunga = 0.12; // Bunga per bulan 12%

    // Constructor, getters, setters, dan methods lainnya

    public Double hitungTotalHutang() {
        return jumlahHutang + (jumlahHutang * bunga * lama);
    }
}
