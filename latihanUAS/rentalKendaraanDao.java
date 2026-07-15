/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUas;

/**
 *
 * @author user
 */
public class rentalKendaraanDao {
    private final rentalKendaraan rental[];
    private int jumlahRental;
    
    public rentalKendaraanDao(int kapasitas){
        rental = new rentalKendaraan[kapasitas];
        jumlahRental = 0;
    }
    
    public boolean Simpan(rentalKendaraan rntal){
        if(jumlahRental < rental.length){
            rental[jumlahRental] = rntal;
            jumlahRental++;
            return true;  
        }
        return false;
    }
    
    public rentalKendaraan[] getALL () {
        rentalKendaraan[] data = new rentalKendaraan[jumlahRental];
        System.arraycopy(rental, 0, data, 0, jumlahRental);
        return data;
    }
    
    public rentalKendaraan getById_sewa(String id_sewa) {
        for(int i=0;i<jumlahRental;i++) {
            if(rental[i].getId_sewa().equals(id_sewa)) {
                return rental[i];
            }
        }
        return null;
    }
    
    public boolean update(String id_sewa, rentalKendaraan dataBaru) {
        for(int i=0; i<jumlahRental;i++) {
            if(rental[i].getId_sewa().equals(id_sewa)) {
                rental[i] = dataBaru;
            }
            return true;
        }
        return false;
    }
    
    public boolean delete(String nim) {
        for(int i = 0;i<jumlahRental;i++) {
            for(int j=i; j<jumlahRental - 1;j++) {
                rental[j] = rental[j + 1];
            }
            rental[jumlahRental -1 ] = null;
            jumlahRental--;
            return true;
        }
        return false;
    }
}
