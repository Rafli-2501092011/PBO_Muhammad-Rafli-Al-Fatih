/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUas;

/**
 *
 * @author user
 */
public class rentalKendaraan extends kendaraan{
    private String namaRental;
    private Double lama_sewa;
    private Double biaya_sewa;
    private double biaya_tambahan;
    private Double total_bayar;

    public rentalKendaraan() {
    }

    public rentalKendaraan(String namaRental) {
        this.namaRental = namaRental;
    }

    public rentalKendaraan(Double lama_sewa, Double biaya_sewa, double biaya_tambahan, Double total_bayar) {
        this.lama_sewa = lama_sewa;
        this.biaya_sewa = biaya_sewa;
        this.biaya_tambahan = biaya_tambahan;
        this.total_bayar = total_bayar;
    }

    public String getNamaRental() {
        return namaRental;
    }

    public void setNamaRental(String namaRental) {
        this.namaRental = namaRental;
    }

    public Double getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(Double lama_sewa) {
        this.lama_sewa = lama_sewa;
    }

    public Double getBiaya_sewa() {
        biaya_sewa = harga*lama_sewa;
        return biaya_sewa;
    }

    public Double getBiaya_tambahan() {
        if(lama_sewa > 5){
            biaya_tambahan = 0.1*biaya_sewa;
        }else if(lama_sewa <= 5){
            biaya_tambahan = 0;
        }else {
            biaya_tambahan = 0;
        }
        return biaya_tambahan;
    }

    public Double getTotal_bayar() {
        total_bayar = biaya_sewa + biaya_tambahan;
        return total_bayar;
    }

    public void setBiaya_sewa(Double biaya_sewa) {
        this.biaya_sewa = biaya_sewa;
    }

    public void setTotal_bayar(Double total_bayar) {
        this.total_bayar = total_bayar;
    }

    public void setBiaya_tambahan(double biaya_tambahan) {
        this.biaya_tambahan = biaya_tambahan;
    }

}
