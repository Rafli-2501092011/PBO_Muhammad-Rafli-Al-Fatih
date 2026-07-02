/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package april23;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author LAB-SI-PC
 */
public class pegawaiData_23April {
    pegawai_23April[] data = new pegawai_23April[10];
    NumberFormat b = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

    public void insert(pegawai_23April in, int i) {
        data[i] = in;
    }

    public void update(pegawai_23April pegawaibaru, int i) {
        data[i] = pegawaibaru;
    }

    public void delete(int i) {
        data[i] = null;
    }

    public void view() {

        for (int i = 0; i < data.length; i++) {

            if (data[i] != null) {

                pegawai_23April p = data[i]; 

                System.out.println("\n======== Data " + p.getNama() + " ========");
                System.out.println("NIP             : " + p.getNip());
                System.out.println("Nama            : " + p.getNama());
                System.out.println("Golongan        : " + p.getGolongan());
                System.out.println("Gajipokok       : " + b.format(p.getGajipokok()));
                System.out.println("Tunjangan       : " + b.format(p.getTunjangan()));
                System.out.println("Potongan(2%)    : " + b.format(p.getPotongan()));
                System.out.println("Gajibersih      : " + b.format(p.getGajibersih()));
            }
        }
    }
}
