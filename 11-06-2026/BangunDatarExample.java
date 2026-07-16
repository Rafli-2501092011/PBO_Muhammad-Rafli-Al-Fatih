/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl11_06_26;

/**
 *
 * @author LAB-SI-PC
 */
public class BangunDatarExample {
    public static void main(String[] args) {
        BangunDatar bg1 = new BangunDatar(5, 3);
        BangunDatar bg2 = new BangunDatar(6, 2);
        
        Relation BangunDatar = new BangunDatar();
        System.out.println("Luas Bangun Datar Pertama = " + bg1.getLuas());
        System.out.println("Luas Bangun Datar Pertama = " + bg2.getLuas());
        System.out.println();
        System.out.println("Apakah Luas Bangun Datar Pertama lebih besar dari Bangun Datar Kedua ? " + BangunDatar.isGreater(bg1, bg2));
        System.out.println("Apakah Luas Bangun Datar Pertama lebih besar dari Bangun Datar Kedua ? " + BangunDatar.isLess(bg1, bg2));
        System.out.println("Apakah Luas Bangun Datar Pertama lebih besar dari Bangun Datar Kedua ? " + BangunDatar.isEqual(bg1, bg2));
    }
}
