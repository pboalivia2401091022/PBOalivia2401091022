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
public class Latihan654WhileLoop {
     public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        System.out.print("Masukkan nilai pangkat: ");
        int pangkat = scanner.nextInt();

        int hasil = 1;
        int i = 0;
        while (i < pangkat) {
            hasil *= angka;
            i++;
        }

        System.out.println(angka + " pangkat " + pangkat + " = " + hasil);
    }
}
    

