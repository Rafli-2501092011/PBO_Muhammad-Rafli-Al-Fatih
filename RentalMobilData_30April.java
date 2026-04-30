/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april30;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobilData_30April {
    private RentalMobil_30April[] data = new RentalMobil_30April[100];
    private int jumlah = 0;
    NumberFormat b = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public void tambah(RentalMobil_30April input) {
        if (jumlah < data.length) {
            data[jumlah] = input;
            jumlah++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    public void tampil() {
        if (jumlah == 0) {
            System.out.println("Data kosong!");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            RentalMobil_30April view = data[i];

            System.out.println("ID Sewa            : " + view.getid_sewa());
            System.out.println("Nama Penyewa       : " + view.getnama_penyewa());
            System.out.println("Jenis Mobil        : " + view.getjenis_mobil());
            System.out.println("Lama Sewa          : " + view.getlama_sewa()+ " hari");
            System.out.println("Harga Sewa/hari    : " + b.format(view.getharga_sewa()));
            System.out.println("Biaya Sewa         : " + b.format(view.getbiaya_sewa()));
            System.out.println("Biaya Tambahan     : " + b.format(view.getbiaya_tambahan()));
            System.out.println("Total Bayar        : " + b.format(view.gettotal_bayar()));
            System.out.println("--------------------------------------");
        }
    }

    public boolean update(String id, RentalMobil_30April dataBaru) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getid_sewa().equals(id)) {
                data[i] = dataBaru;
                return true;
            }
        }
        return false;
    }

    public boolean hapus(String id) {
        for (int i = 0; i < jumlah; i++) {
            if (data[i].getid_sewa().equals(id)) {

                for (int j = i; j < jumlah - 1; j++) {
                    data[j] = data[j + 1];
                }

                jumlah--;
                return true;
            }
        }
        return false;
    }
}
