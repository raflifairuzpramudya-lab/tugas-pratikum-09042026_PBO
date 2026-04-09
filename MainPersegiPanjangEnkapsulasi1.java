/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PersegiPanjangEnkapsulasi1;

/**
 *
 * @author rafli
 */
import java.util.Scanner;

public class MainPersegiPanjangEnkapsulasi1 {

    public static void main(String[] args) {
        PersegiPanjangEnkapsulasi1 pp1 = new PersegiPanjangEnkapsulasi1();
        pp1.setPanjang(10);
        pp1.setLebar(7);
        pp1.tampildata();
   
        System.out.println("\nObjek 1 Menggunakan consctructor 1");
        System.out.println("Akses Method dalam main class");
        System.out.println("Banyak Objek : "+ PersegiPanjangEnkapsulasi1.getJumlahObjek());
        System.out.println("Luas Persegi Panjang : "+pp1.HitungLuas());
        System.out.println("keliling Persegi Panjang : "+pp1.HitungKel());
        pp1.tampildata();
        
        System.out.println("\nObjek 2 Menggunakan consctructor 2");
        PersegiPanjangEnkapsulasi1 pp2 = new PersegiPanjangEnkapsulasi1(19,10);
        pp2.tampildata();
        
        System.out.println("\nObjek 3 Menggunakan constructor 2");
        System.out.println("Panjang dan Lebar di-input user");
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Panjang = ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar = ");
        int lebar = input.nextInt();
        /*pp3.panjang = panjang;
        pp3.lebar = lebar;*/
        PersegiPanjangEnkapsulasi1 pp3 = new PersegiPanjangEnkapsulasi1(panjang,lebar);
        pp3.tampildata();
    }   
}