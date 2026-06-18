/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rafli18_6_26;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiExample {
    public static void main(String[] args) {
        MahasiswaNilai satu = new MahasiswaNilai();
        
        satu.setNim("2011");
        satu.setNama("Rafli");
        satu.setAlamat("Padang");
        satu.setTugas(88.0);
        satu.setUts(85.0);
        satu.setUas(90.0);
        
        System.out.println("Nama            : " + satu.getNama());
        System.out.println("NIM             : " + satu.getNim());
        System.out.println("Alamat          : " + satu.getAlamat());
        System.out.println("Nilai Tugas     : " + satu.getTugas());
        System.out.println("Nilai Uts       : " + satu.getUts());
        System.out.println("Nilai Uas       : " + satu.getUas());
        System.out.println("Nilai Angka     : " + satu.getNilaiAngka());
        System.out.println("Nilai Huruf     : " + satu.getNilaiHuruf());
    }
}
