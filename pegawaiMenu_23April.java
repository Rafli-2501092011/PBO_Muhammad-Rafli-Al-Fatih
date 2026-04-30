/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april23;

import java.io.*;

/**
 *
 * @author LAB-SI-PC
 */
public class pegawaiMenu_23April {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    pegawaiData_23April data = new pegawaiData_23April();

    int index = 0;

    public void menu() throws IOException {

        int pilih;

        do {
            System.out.println("\n===== MENU PEGAWAI =====");
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Update Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            pilih = Integer.parseInt(input.readLine());

            switch (pilih) {

                case 1:
                    pegawai_23April p = new pegawai_23April();

                    System.out.print("Masukkan NIP  : ");
                    p.setNip(input.readLine());

                    System.out.print("Masukkan Nama : ");
                    p.setNama(input.readLine());

                    System.out.print("Masukkan Golongan (IIIA/IIIB/IIIC): ");
                    p.setGolongan(input.readLine());

                    data.insert(p, index);
                    index++;

                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    data.view();
                    break;

                case 3:
                    System.out.print("Masukkan index yang dihapus: ");
                    int hapus = Integer.parseInt(input.readLine());

                    data.delete(hapus);
                    System.out.println("Data dihapus!");
                    break;

                case 4:
                    System.out.print("Masukkan index yang diupdate: ");
                    int idx = Integer.parseInt(input.readLine());

                    pegawai_23April baru = new pegawai_23April();

                    System.out.print("NIP baru  : ");
                    baru.setNip(input.readLine());

                    System.out.print("Nama baru : ");
                    baru.setNama(input.readLine());

                    System.out.print("Golongan baru : ");
                    baru.setGolongan(input.readLine());

                    data.update(baru, idx);

                    System.out.println("Data berhasil diupdate!");
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}
