/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rafli;

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7 {
    public static void main(String[] args) {
        String entry [][] = {{"Florence", "735-1234", "Manila"}, 
       {"Joyce", "983-3333", "Quezon City"}, 
       {"Becca", "456-3322", "Manila"}};
        int i = 0;
        int j= 0;
        
        for(i=0;i<entry.length;i++){
            for(j=0;j<entry[i].length;j++){
                System.out.println("Name    : "+ entry[i][0]);
                System.out.println("Tel. #  : "+ entry[i][1]);
                System.out.println("Address : "+ entry[i][2]);
            }
        }
    }
}
