/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl02_07_26;

/**
 *
 * @author LAB-SI-PC
 */
public class MahasiswaNilaiController {
    private final MahasiswaNilaiDao dao;
    
    public MahasiswaNilaiController() {
        this.dao = new MahasiswaNilaiDao(10);
    }
    
    public String insert(MahasiswaNilai mhsBaru){
        if(dao.getByNim(mhsBaru.getNim()) != null ){
            return "Mahasiswa Sudah Ada";
        }
        boolean hasil = dao.Simpan(mhsBaru);
        if(hasil){
            return "Sukses";
        }else {
            return "Gagal";
        }
    }
    
    public MahasiswaNilai[] getAll(){
        return dao.getALL();
    }
    
    public MahasiswaNilai getByNIm(String nim){
        return dao.getByNim(nim);
    }
}
