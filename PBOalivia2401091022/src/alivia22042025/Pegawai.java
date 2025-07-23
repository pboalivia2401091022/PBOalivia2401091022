/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alivia22042025;

/**
 *
 * @author hp
 */
public class Pegawai {
        private String Nip;
        private String Nama;
        private String Golongan;
        private double GajiPokok;
        private double Tunjangan;
        private double TotalGaji;

    public Pegawai(String Nip, String Nama, String Golongan) {
        this.Nip = Nip;
        this.Nama = Nama;
        this.Golongan = Golongan;
        Gaji();
    }

    private void Gaji() {
        switch (Golongan) {
            case "1A":
                GajiPokok = 1000000;
                break;
            case "2A":
                GajiPokok = 2000000;
                break;
            case "3A":
                GajiPokok = 3000000;
                break;
            default:
                System.out.println("Golongan tidak valid");
                return;
        }

        Tunjangan = GajiPokok * 0.05;
        TotalGaji = GajiPokok + Tunjangan;
    }

    public void tampilkanData() {
        System.out.println("NIP: " + Nip);
        System.out.println("Nama: " + Nama);
        System.out.println("Golongan: " + Golongan);
        System.out.println("Gaji Pokok: Rp " + GajiPokok);
        System.out.println("Tunjangan: Rp " + Tunjangan);
        System.out.println("Total Gaji: Rp " + TotalGaji);
    }

   
}

