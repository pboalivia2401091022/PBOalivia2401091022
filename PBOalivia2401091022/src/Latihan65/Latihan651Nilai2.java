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
import javax.swing.JOptionPane;
public class Latihan651Nilai2 {
   public static void main(String[] args) {
        int nilaiUjian1 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian 1: "));
        int nilaiUjian2 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian 2: "));
        int nilaiUjian3 = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai ujian 3: "));

        int nilaiRataRata = (nilaiUjian1 + nilaiUjian2 + nilaiUjian3) / 3;

        String output = "Nilai rata-rata: " + nilaiRataRata;

        if (nilaiRataRata >= 60) {
            output += " :-)";
        } else {
            output += " :-( ";
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
    

