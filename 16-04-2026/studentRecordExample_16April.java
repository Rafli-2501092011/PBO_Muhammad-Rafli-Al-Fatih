/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab_10;

/**
 *
 * @author LAB-SI-PC
 */
public class studentRecordExample_16April {
    public static void main(String[] args) {
        studentRecord_16April ali = new studentRecord_16April();
        studentRecord_16April ani = new studentRecord_16April();
        studentRecord_16April deni = new studentRecord_16April("Deni","Padang",20);
        studentRecord_16April uni = new studentRecord_16April("Uni","Padang",20);
        
        deni.jenisKelamin = "L";
        
        ali.setName("Ali");
        ali.setAddress("Padang");
        ali.setAge(20);
        ali.setMathGrade(80);
        ali.setEnglishGrade(85);
        ali.setScienceGrade(70);
        
        System.out.println("Data 1");
        System.out.println("Nama                : "+ ali.getName());
        System.out.println("Alamat              : "+ ali.getAddress());
        System.out.println("Umur                : "+ ali.getAge());
        System.out.println("Matematika          : "+ ali.getMathGrade());
        System.out.println("B. Inggris          : "+ ali.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan    : "+ ali.getScienceGrade());
        System.out.println("Rata-rata           : "+ ali.getAverage());
        System.out.println();
        System.out.println("Data 2");
        
        ani.setName("Ani");
        ani.setAddress("Bukittingi");
        ani.setAge(20);
        ani.setMathGrade(85);
        ani.setEnglishGrade(85);
        ani.setScienceGrade(90);
        ani.print("");
        
        System.out.println();
        ani.print(70,80,90);
        
        System.out.println();
        ali.print(80,85,90);
        
        System.out.println();
        deni.print("");
        
        System.out.println();
        uni.print("");
        uni.print(80,90,95);
        
        System.out.println();
        System.out.println("Jumlah Siswa        : "+ studentRecord_16April.getStudentCount());
    }
}
