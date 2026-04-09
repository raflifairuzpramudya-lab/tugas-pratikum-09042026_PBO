/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.diagramakunbank;

/**
 *
 * @author asus
 */


public class MainAkunBank {

    public static void main(String[] args) {
        // 1. Inisialisasi Akun (Saldo awal otomatis 1 Juta dari Constructor)
        AkunBank akun = new AkunBank("123456789", "Rafli Fairuz");

        // 2. Menampilkan Informasi Saldo Awal
        System.out.println("=== INFORMASI SALDO AWAL ===");
        akun.tampilkanInformasi();

        // 3. Melakukan Transaksi Deposit (Misal: Tambah 500.000)
        System.out.println("Melakukan Deposit...");
        akun.deposit(500000);
        System.out.println("=== SALDO SETELAH DEPOSIT ===");
        akun.tampilkanInformasi();

        // 4. Melakukan Transaksi Withdraw (Misal: Tarik 300.000)
        System.out.println("Melakukan Withdraw...");
        akun.withdraw(300000);
        System.out.println("=== SALDO SETELAH WITHDRAW ===");
        akun.tampilkanInformasi();

        // 5. Simulasi Saldo Tidak Cukup (Misal: Tarik 2 Juta)
        System.out.println("Mencoba Withdraw Melebihi Saldo...");
        akun.withdraw(2000000);
        
        System.out.println("=== PROSES SELESAI ===");
    }
}
