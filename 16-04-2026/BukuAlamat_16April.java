/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudenRec;
/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamat_16April {
    private String Nama;
    private String Alamat;
    private String Nomor;
    private String Email;
    
    private static int BukuAlamatcount;
    
    public BukuAlamat_16April(){
        this("");
        BukuAlamatcount++;
    }

    public BukuAlamat_16April(String temp) {
        this.Nama = temp;
        BukuAlamatcount++;
    }

    public BukuAlamat_16April(String Nama, String Alamat, String Nomor) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Nomor = Nomor;
        BukuAlamatcount++;
    }
    public BukuAlamat_16April(String Nama, String Alamat, String Nomor, String Email) {
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Nomor = Nomor;
        this.Email = Email;
        BukuAlamatcount++;
    }
    
    
    public String getNama() {
        return Nama;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    public String getNomor() {
        return Nomor;
    }
    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }
    
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
}
