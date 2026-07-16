/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgl11_06_26;

/**
 *
 * @author LAB-SI-PC
 */
public class LineExample {
    public static void main(String[] args) {
        Line line1 = new Line(1, 5, 1, 5);
        Line line2 = new Line(0, 5, 0, 5);
        
        Relation Line = new Line();
        System.out.println("Panjang Line Pertama = " + line1.getLength());
        System.out.println("Panjang Line Kedua = " + line2.getLength());
        System.out.println();
        System.out.println("Apakah Line1 lebih panjang dari Line2? " + Line.isGreater(line1, line2));
        System.out.println("Apakah Line1 lebih pendek dari Line2? " + Line.isLess(line1, line2));
        System.out.println("Apakah Line1 sama panjang dari Line2? " + Line.isEqual(line1, line2));
        
    }
}
