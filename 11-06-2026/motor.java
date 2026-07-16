/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl11_06_26;

/**
 *
 * @author LAB-SI-PC
 */
public class motor extends Kendaraan{
    private double maxkecepatan;
//    private double kec_saatini;
//    private double kec_max;
//    private double jarak;
//    private double waktu;
    
//    public motor( double jarak, double waktu) {
//        this.jarak = jarak;
//        this.waktu = waktu;
//    }

//    public motor(double kec_saatini, double kec_max) {
//        this.kec_saatini = kec_saatini;
//        this.kec_max = kec_max;
//    }
    public motor(double maxkecepatan) {
        this.maxkecepatan = maxkecepatan;
    }

    @Override
    public String getnama() {
        System.out.println("Nama Kendaraan  : Motor");
        return null;
    }

    @Override
    public double getmaxkecepatan() {
        return maxkecepatan;
//      return Math.min(kec_saatini, kec_max);
//      return jarak/waktu;
    }
    
}
