/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab_10;

/**
 *
 * @author LAB-SI-PC
 */
public class studentRecord_16April {

    private String name;
    private String address;
    private int age;
    String jenisKelamin;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    private static int studentCount;

    public studentRecord_16April(){
        this("Ani","padang", 20);
        studentCount++;
    }

    public studentRecord_16April(String temp) {
        this.name = temp;
        studentCount++;
    }

    public studentRecord_16April(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
        studentCount++;
    }

    public studentRecord_16April(double mGrade, double eGrade, double sGrade) {
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public double getAverage() {
        average = (mathGrade + englishGrade + scienceGrade) / 3;
        return average;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void print(String temp) {
        System.out.println("Name            : " + name);
        System.out.println("Alamat          : " + address);
        System.out.println("Umur            : " + age);
    }

    public void print(double mathGrade, double englishGrade, double scienceGrade) {
        System.out.println("Name            : " + name);
        System.out.println("Math Grade      : " + mathGrade);
        System.out.println("English Grade   : " + englishGrade);
        System.out.println("Science Grade   : " + scienceGrade);
    }
}
