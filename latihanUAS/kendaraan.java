/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUas;

/**
 *
 * @author user
 */
public class kendaraan {
    private String plat;
    private String id_sewa;
    private String jenis_mobil;
    double harga;

    public kendaraan() {
    }

    public kendaraan(String plat, String id_sewa, String jenis_mobil, double harga) {
        this.plat = plat;
        this.id_sewa = id_sewa;
        this.jenis_mobil = jenis_mobil;
        this.harga = harga;
    }

    public String getPlat() {
        return plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getId_sewa() {
        return id_sewa;
    }

    public void setId_sewa(String id_sewa) {
        this.id_sewa = id_sewa;
    }

    public String getJenis_mobil() {
        return jenis_mobil;
    }

    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
        
        if(jenis_mobil.equals("Avanza")){
            harga=300000;
        }else if(jenis_mobil.equals("Innova")){
            harga=500000;
        }else if(jenis_mobil.equals("Fortuner")){
            harga=800000;
        }else {
            harga=0;
        }
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    
}
