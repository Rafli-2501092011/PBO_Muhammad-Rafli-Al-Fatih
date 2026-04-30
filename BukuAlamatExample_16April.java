/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudenRec;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatExample_16April {
    public static void main(String[] args) {
        BukuAlamat_16April a = new BukuAlamat_16April();
        BukuAlamatData_16April data = new BukuAlamatData_16April();
        
        a.setNama("Ali");
        a.setAlamat("Padang");
        a.setNomor("081238475890");
        a.setEmail("ali@gmail.com");
        data.insert(a, 0);
        a = new BukuAlamat_16April();
        a.setNama("Ani");
        a.setAlamat("Padang");
        a.setNomor("08123867346");
        a.setEmail("ani@gmail.com");
        data.insert(a, 1);
        a= new BukuAlamat_16April();
        a.setNama("Budi");
        a.setAlamat("Bukittinggi");
        a.setNomor("08123477346");
        a.setEmail("budi@gmail.com");
        data.insert(a, 2);
        data.delete(0);
        data.view();
        
    }
}
