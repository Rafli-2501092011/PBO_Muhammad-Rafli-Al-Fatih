/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rafli;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_Nomor_Terbesar {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        int number [] = new int[10];
        
        for(int i=0;i<number.length;i++){
            String input = JOptionPane.showInputDialog("Masukkan angka ke-" + (i+1) + ":");
            number[i] = Integer.parseInt(input);
        }
        int max = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Angka terbesar yang Anda masukkan adalah: " + max);
    }
}
