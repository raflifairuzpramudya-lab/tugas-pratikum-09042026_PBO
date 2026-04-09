/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersegiPanjangEnkapsulasi1;

/**
 *
 * @author asus
 */
public class AkunBankEnkapsulasi {
    private String noRekening;
    private String namaNasabah;
    private double saldo = 1000000; // saldo awal

    public AkunBankEnkapsulasi(String noRekening, String namaNasabah) {
        this.noRekening = noRekening;
        this.namaNasabah = namaNasabah;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Deposit berhasil!");
        System.out.println("Saldo sekarang: " + saldo);
    }

    public void withdraw(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo Tidak Cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Withdraw berhasil!");
            System.out.println("Saldo sekarang: " + saldo);
        }
    }
}