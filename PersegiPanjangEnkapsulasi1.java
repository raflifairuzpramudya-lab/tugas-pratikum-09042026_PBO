/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PersegiPanjangEnkapsulasi1;

/**
 *
 * @author rafli
 */
import java.util.Scanner;
public class PersegiPanjangEnkapsulasi1 {

        private int panjang;
        private int lebar;
        private static int jumlahObjek=0;
        
        PersegiPanjangEnkapsulasi1(){
           jumlahObjek++;
        }
        
        PersegiPanjangEnkapsulasi1(int p, int l){
            panjang = p;
            lebar = l;
            jumlahObjek++;
        }
        
        //getter dan setter
        
        public int getPanjang() {
        return panjang;
        }
        
        public void setPanjang(int panjang) {
        this.panjang = panjang;
        }
        
        public int getLebar() {
        return lebar;
        }
        
        public void setLebar(int lebar) {
        this.lebar = lebar;
        }
        
        public static int getJumlahObjek() {
        return jumlahObjek;
        }
        
        
        public int HitungLuas(){
            return(panjang*lebar);
        }
        
        public int HitungKel(){
            return(2*(panjang+lebar));
        }
        
        public void tampildata(){
            System.out.println("Panjang persegi panjang : "+panjang);
            System.out.println("Lebar Persegi Panjang : "+lebar);
            System.out.println("Luas Persegi Panjang : "+HitungLuas());
            System.out.println("Keliling Persegi Panjang : "+HitungKel());
        }   
}