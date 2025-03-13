/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan65;

/**
 *
 * @author LABP1KOMP
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan651Nilai1{
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int nilaiUjian1 = 0;
        int nilaiUjian2 = 0;
        int nilaiUjian3 = 0;

        try {
            System.out.print("Masukkan nilai ujian 1: ");
            nilaiUjian1 = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan nilai ujian 2: ");
            nilaiUjian2 = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan nilai ujian 3: ");
            nilaiUjian3 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            System.out.println("Kesalahan input");
        }

        int nilaiRataRata = (nilaiUjian1 + nilaiUjian2 + nilaiUjian3) / 3;

        System.out.print("Nilai rata-rata: " + nilaiRataRata);

        if (nilaiRataRata >= 78) {
            System.out.println(" :-)");
        } else {
            System.out.println(" :-( ");
        }
    }
}

