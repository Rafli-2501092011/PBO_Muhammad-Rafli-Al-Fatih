/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april30;

/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobil_30April {
    
    private String id_sewa;
    private String nama_penyewa;
    private String jenis_mobil;
    private double lama_sewa;
    private double biaya_sewa;
    private double harga_sewa;
    private double biaya_tambahan;
    private double total_bayar;
    
    public String getid_sewa() {
        return id_sewa;
    }
    public void setid_sewa (String id_sewa) {
        this.id_sewa = id_sewa;
    }
    
    public String getnama_penyewa() {
        return nama_penyewa;
    }
    public void setnama_penyewa (String nama_penyewa) {
        this.nama_penyewa = nama_penyewa;
    }
    
    public String getjenis_mobil() {
        return jenis_mobil;
    }
    public void setjenis_mobil (String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
        
        if(jenis_mobil.equals("Avanza")){
            harga_sewa=300000;
        }else if(jenis_mobil.equals("Innova")){
            harga_sewa=500000;
        }else if(jenis_mobil.equals("Fortuner")){
            harga_sewa=800000;
        }else {
            harga_sewa=0;
        }
    }
    public double getharga_sewa(){
        return harga_sewa;
    }
    
    public double getlama_sewa() {
        return lama_sewa;
    }
    public void setlama_sewa (double lama_sewa) {
        this.lama_sewa = lama_sewa;
    }
    public double getbiaya_tambahan() {
        if(lama_sewa > 5){
            biaya_tambahan = 0.1*biaya_sewa;
        }else if(lama_sewa <= 5){
            biaya_tambahan = 0;
        }else {
            biaya_tambahan = 0;
        }
        return biaya_tambahan;
    }
    public double getbiaya_sewa() {
        biaya_sewa = harga_sewa*lama_sewa;
        return biaya_sewa;
    }
    public double gettotal_bayar(){
        total_bayar = biaya_sewa - biaya_tambahan;
        return total_bayar;
    }
    
}
