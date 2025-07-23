/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alivia03042025;

/**
 *
 * @author hp
 */
    public class Main {
       public static void main(String[] args) {
        StudentRecordExtend anna =new StudentRecordExtend("Anna", "Padang", "Java OOP");
              anna.printInfo();
              System.out.println();

        StudentRecordExtend beah =new StudentRecordExtend("Beah", "Bukittinggi", "HTML & CSS");
               beah.printInfo();
               System.out.println();

        StudentRecordExtend chris =new StudentRecordExtend("Chris", "Solok", "Python Advanced");
               chris.printInfo();
       
    }
}