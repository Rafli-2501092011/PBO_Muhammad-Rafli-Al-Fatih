/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudenRec;

/**
 *
 * @author LAB-SI-PC
 */
public class BukuAlamatData_16April {
        BukuAlamat_16April[] data = new BukuAlamat_16April[5];
        
        public void insert(BukuAlamat_16April bukuAlamat, int i){
            data[i] = bukuAlamat;
        }
        
        public void update(BukuAlamat_16April bukuAlamatBaru, int i){
            data[i] = bukuAlamatBaru;
        }
        
        public void delete(int i){
            data[i] = null;
        }
        public void view(){
            for (int i=0;i<data.length;i++){
                if (data[i] != null){
                    System.out.println("Data ke ---> "+ (i+1));
                    System.out.println("Nama           : "+data[i].getNama());
                    System.out.println("Alamat         : "+data[i].getAlamat());
                    System.out.println("Nomor Telepon  : "+data[i].getNomor());
                    System.out.println("Alamat E-mail  : "+data[i].getEmail());
                    System.out.println("------------------------------------------------");
                }
            }
        }
}
