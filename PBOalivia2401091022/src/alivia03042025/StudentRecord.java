/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alivia03042025;

/**
 *
 * @author hp
 */
 class StudentRecord {
    protected String name;
    protected int age;
    protected String grade;

    public StudentRecord(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayRecord() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
        System.out.println("Kelas: " + grade);
    }
}