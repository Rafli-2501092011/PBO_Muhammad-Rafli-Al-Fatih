/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rafli18_6_26;

/**
 *
 * @author LAB-SI-PC
 */
public class Pegawai {
    private String nip;
    private String nama;
    private String golongan;
    private Double gajipokok;
    private Double tunjangan;
    private Double potongan;
    private Double gajibersih;

    public Pegawai() {
    }

    public Pegawai(String nip, String nama, String golongan) {
        this.nip = nip;
        this.nama = nama;
        this.golongan = golongan;
    }

    public Pegawai(Double gajipokok, Double tunjangan, Double potongan, Double gajibersih) {
        this.gajipokok = gajipokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.gajibersih = gajibersih;
    }

    public Double getGajipokok() {
        if (golongan.equals("1A")){
            gajipokok = 3000000.0;
        }else if (golongan.equals("1B")){
            gajipokok = 4000000.0;
        }else if (golongan.equals("1C")){
            gajipokok = 5000000.0;
        }else {
            gajipokok = 0.0;
        }
        return gajipokok;
    }

    public Double getTunjangan() {
        tunjangan = 0.1 * gajipokok;
        return tunjangan;
    }

    public Double getPotongan() {
        potongan = 0.02 * gajipokok;
        return potongan;
    }

    public Double getGajibersih() {
        gajibersih = (gajipokok + tunjangan) - potongan;
        return gajibersih;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGolongan() {
        return golongan;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
    }

}
