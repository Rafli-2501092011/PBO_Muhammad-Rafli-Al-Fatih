/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rafli;

/**
 *
 * @author LAB-SI-PC
 */
public class fungsi_Aritmatika {
    int tambah (int a, int b){
       int c = a + b;
       return c;
    }
    int kurang (int a, int b){
       int c = a - b;
       return c;
    }
    int kali (int a, int b){
       int c = a * b;
       return c;
    }
    int bagi (int a, int b){
       int c = a / b;
       return c;
    }
    boolean bilganjil(int i){
        if(i%2!=2){
            return true;
        }else {
            return false;
        }
    }
    public static void main( String[] args){
        fungsi_Aritmatika aritmatika = new fungsi_Aritmatika();
        int a = aritmatika.tambah(5, 7);
        int b = aritmatika.kurang(5, 7);
        int c = aritmatika.kali(5, 7);
        int d = aritmatika.bagi(5, 7);
        boolean e = aritmatika.bilganjil(7);
        
        System.out.println("Hasil penjumlahan   = "+ a);
        System.out.println("Hasil pengurangan   = "+ b);
        System.out.println("Hasil perkalian     = "+ c);
        System.out.println("Hasil pembagian     = "+ d);
        System.out.println(e +" "+"bilangan ganjil");
    }
}
