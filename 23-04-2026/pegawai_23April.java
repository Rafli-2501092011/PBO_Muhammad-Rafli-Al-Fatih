/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april23;

/**
 *
 * @author LAB-SI-PC
 */
public class pegawai_23April {
    private String nip;
    private String nama;
    private String golongan;
    private double gajipokok;
    private double tunjangan;
    private double potongan;
    private double gajibersih;
    
    public String getNip() {
        return nip;
    }
    public void setNip (String nip) {
        this.nip = nip;
    }
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getGolongan () {
        return golongan;
    }
    public void setGolongan(String golongan) {
        this.golongan = golongan;
        
        if (golongan.equals("IIIA")){
            gajipokok = 2000000;
        }else if (golongan.equals("IIIB")){
            gajipokok = 2500000;
        }else if (golongan.equals("IIIC")){
            gajipokok = 3000000;
        }else {
            gajipokok = 0;
            System.out.print("Invalid!");
        }
    }
    public double getGajipokok () {
        return gajipokok;
    }

    public double getTunjangan (){
        tunjangan = 0.1 * gajipokok;
        return tunjangan;
    }
   
    public double getPotongan() {
        potongan = -0.02 * (gajipokok+tunjangan);
        return potongan;
    }
    public double getGajibersih(){
        gajibersih = (gajipokok + tunjangan) + potongan;
        return gajibersih;
    }
}
