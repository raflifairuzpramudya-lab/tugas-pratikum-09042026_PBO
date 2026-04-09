/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.diagramakunbank;

/**
 *
 * @author asus
 */

public class AkunBank {
    // 1. Atribut harus di dalam sini
    private final String noRekening;
    private final String namaNasabah;
    private final double saldo;

    // 2. Constructor juga di dalam sini
    public AkunBank(String noRek, String nama) {
        this.noRekening = noRek;
        this.namaNasabah = nama;
        this.saldo = 1000000; 
    }

    // 3. Method deposit dan withdraw juga di dalam sini
    public void deposit(double jumlah) {
        // isi kode deposit
    }
    
    public void withdraw(double jumlah) {
        // isi kode withdraw
    }

    public void tampilkanInformasi() {
    System.out.println("No Rekening  : " + this.noRekening);
    System.out.println("Nama Nasabah : " + this.namaNasabah);
    System.out.println("Saldo        : Rp" + this.saldo);
    System.out.println("-----------------------------");
    
    }
}

        