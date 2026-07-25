/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_muhammad.rafli.al.fatih;
import java.io.*;
/**
 *
 * @author user
 */
public class Latihan_6_perpangkatan {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int angka1 = 0;
        int pangkat = 0;
        int c = 1;
        
        try {
            System.out.print("Masukan Angka : ");
            angka1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Masukan Pangkat : ");
            pangkat = Integer.parseInt(dataIn.readLine());
        }catch (IOException e) {
            System.out.println("Error!");
        }
        for (int i=0;i<pangkat;i++){
            c = c*angka1;
        }
        System.out.println("Hasil "+ angka1 + " pangkat "+ pangkat +" = " + c);
    }
}
