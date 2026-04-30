/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april30;
import java.io.*;
/**
 *
 * @author LAB-SI-PC
 */
public class RentalMobilMenu_30April {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        RentalMobilData_30April data = new RentalMobilData_30April();

    public void menu() throws IOException {
        int pilih;

        do {
            System.out.println("\n==== MENU RENTAL MOBIL ====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = Integer.parseInt(br.readLine());

            switch (pilih) {

                case 1:
                    RentalMobil_30April input = new RentalMobil_30April();

                    System.out.print("ID Sewa: ");
                    input.setid_sewa(br.readLine());

                    System.out.print("Nama Penyewa: ");
                    input.setnama_penyewa(br.readLine());

                    System.out.print("Jenis Mobil (Avanza/Innova/Fortuner): ");
                    input.setjenis_mobil(br.readLine());

                    System.out.print("Lama Sewa: ");
                    input.setlama_sewa(Double.parseDouble(br.readLine()));

                    data.tambah(input);
                    System.out.println("Data berhasil ditambah!");
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    System.out.print("Masukkan ID yang diupdate: ");
                    String idUpdate = br.readLine();

                    RentalMobil_30April update = new RentalMobil_30April();

                    System.out.print("Nama Baru: ");
                    update.setnama_penyewa(br.readLine());

                    System.out.print("Jenis Mobil Baru: ");
                    update.setjenis_mobil(br.readLine());

                    System.out.print("Lama Sewa Baru: ");
                    update.setlama_sewa(Double.parseDouble(br.readLine()));

                    update.setid_sewa(idUpdate);

                    if (data.update(idUpdate, update)) {
                        System.out.println("Data berhasil diupdate!");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan ID yang dihapus: ");
                    String idHapus = br.readLine();

                    if (data.hapus(idHapus)) {
                        System.out.println("Data berhasil dihapus!");
                    } else {
                        System.out.println("Data tidak ditemukan!");
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}
