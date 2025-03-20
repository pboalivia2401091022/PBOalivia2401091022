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
import java.util.Scanner;
public class Latihan654DoWhile {
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        double hasil = hitungPangkatDoWhile(nilai, pangkat);
        System.out.println("Hasil: " + hasil);
    }

    public static double hitungPangkatDoWhile(double nilai, int pangkat) {
        double hasil = 1;
        int i = 1;
        do {
            hasil *= nilai;
            i++;
        } while (i <= pangkat);
        return hasil;
    }
}

