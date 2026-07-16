/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl11_06_26;

/**
 *
 * @author LAB-SI-PC
 */
public class KendaraanExample {
    public static void main(String[] args) {
        mobil m = new mobil(250);
        m.getnama();
        System.out.println("Kecepatan Mobil = " + m.getmaxkecepatan() + "Km/jam");
        System.out.println();
        
        motor n = new motor(155);
        n.getnama();
        System.out.println("Kecepatan Motor = " + n.getmaxkecepatan() + "Km/jam");
    }
}
