/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_muhammad.rafli.al.fatih;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Latihan_6_membaca_bilangan {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Masukkan Angka (1-10)");
        int angka = Integer.parseInt(input);
        int a = Integer.parseInt(input);
        String hasil;
        String hasill;
        
        if (angka == 1){
            hasil = "Satu";
        }else if (angka == 2){
            hasil = "Dua";
        }else if (angka == 3){
            hasil = "Tiga";
        }else if (angka == 4){
            hasil = "Empat";
        }else if (angka == 5){
            hasil = "Lima";
        }else if (angka == 6){
            hasil = "Enam";
        }else if (angka == 7){
            hasil = "Tujuh";
        }else if (angka == 8){
            hasil = "Delapan";
        }else if (angka == 9){
            hasil = "Sembilan";
        }else if (angka == 10){
            hasil = "Sepuluh";
        }else {
            hasil = "Tidak Valid!";
        }
        JOptionPane.showMessageDialog(null,hasil);
        switch (a){
            case 1:
                hasill = "Satu";
            break;
            case 2:
                hasill = "Dua";
                break;
            case 3: 
                hasill = "Tiga";
                break;
            case 4:
                hasill = "Empat";
                break;
            case 5:
                hasill = "Lima";
                break;
            case 6:
                hasill = "Enam";
                break;
            case 7:
                hasill = "Tujuh";
                break;
            case 8:
                hasill = "Delapan";
                break;
            case 9:
                hasill = "Sembilan";
                break;
            case 10:
                hasill = "Sepuluh";
                break;
        }
    }
}