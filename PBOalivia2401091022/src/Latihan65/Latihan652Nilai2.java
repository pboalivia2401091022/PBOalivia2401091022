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
import java.io.*;
public class Latihan652Nilai2 {
     public static void main(String[] args) {
       BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in) );
       int angka = 0;
       
        try { 
            System.out.print("Masukkan number 1: ");
            angka = Integer.parseInt(dataIn.readLine());
        } catch(IOException e) {  
            System.out.println("Error dalam membaca input");
        }

        switch (angka) {
            case 1:
                System.out.println("Satu");
                break;
            case 2:
                System.out.println("Dua");
                break;
            case 3:
                System.out.println("Tiga");
                break;
            case 4:
                System.out.println("Empat");
                break;
            case 5:
                System.out.println("Lima");
                break;
            case 6:
                System.out.println("Enam");
                break;
            case 7:
                System.out.println("Tujuh");
                break;
            case 8:
                System.out.println("Delapan");
                break;
            case 9:
                System.out.println("Sembilan");
                break;
            case 10:
                System.out.println("Sepuluh");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }
}

