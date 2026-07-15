/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUas;

/**
 *
 * @author user
 */
public class rentalKendaraanController {
    private final rentalKendaraanDao dao;
    
    public rentalKendaraanController() {
        this.dao = new rentalKendaraanDao(15);
    }
    
    public String insert(rentalKendaraan rntlBaru){
        if(dao.getById_sewa(rntlBaru.getId_sewa()) != null ){
            return "ID Rental Sudah Ada";
        }
        boolean hasil = dao.Simpan(rntlBaru);
        if(hasil){
            return "Sukses";
        }else {
            return "Gagal";
        }
    }
    
    public rentalKendaraan[] getAll(){
        return dao.getALL();
    }
    
    public rentalKendaraan getByNIm(String id_sewa){
        return dao.getById_sewa(id_sewa);
    }
}
