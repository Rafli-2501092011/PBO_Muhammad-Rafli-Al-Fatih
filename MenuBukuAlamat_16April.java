/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudenRec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author LAB-SI-PC
 */
public class MenuBukuAlamat_16April {
    private BukuAlamatData_16April data;
    public MenuBukuAlamat_16April(BukuAlamatData_16April data) {
        this.data = data;
    }
    public void tampilmenu() throws IOException{
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int pilih = Integer.parseInt(dataIn.readLine());  
        BukuAlamat_16April a = new BukuAlamat_16April();
        BukuAlamatData_16April data = new BukuAlamatData_16April();
        
        switch (pilih) {
            case 1:
                a.setNama("Ali");
                a.setAlamat("Padang");
                a.setNomor("081238475890");
                a.setEmail("ali@gmail.com");
                data.insert(a, 0);
                break;
            case 2:
                System.out.print("Index yang dihapus: ");
                int hapus = Integer.parseInt(dataIn.readLine());
                data.delete(hapus);
                data.delete(hapus);
                System.out.println("Data berhasil dihapus!");
                break;
            case 3:
                data.view();
                break;
            case 4:
                System.out.print("Index yang akan diupdate: ");
                int idx = Integer.parseInt(dataIn.readLine());

//                BukuAlamat a = new BukuAlamat();
//                a.setNama("Ali");
//                a.setAlamat("Padang");
//                a.setNomor("081238475890");
//                a.setEmail("ali@gmail.com");
//                data.insert(a, 0);
//                data.update(idx, a);
//                System.out.println("Data berhasil diupdate!");
//                break;
        }
    }
}
