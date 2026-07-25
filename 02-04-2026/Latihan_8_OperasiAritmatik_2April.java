/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_8_OperasiAritmatik_2April {
    public static void main( String[] args ){
        int angka1 = Integer.parseInt(args[0]);
        int angka2 = Integer.parseInt(args[1]);
        
        int tambah = angka1 + angka2;
        int kurang = angka1 - angka2;
        int kali = angka1 * angka2;
        int bagi = angka1 / angka2;
        
        System.out.println("Sum             : "+ tambah);
        System.out.println("difference      : "+ kurang);
        System.out.println("Product         : "+ kali);
        System.out.println("Quotient        : "+ bagi);
    }
}
