/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rafli;

/**
 *
 * @author LAB-SI-PC
 */
public class Latihan_7_Hari_dalam_seminggu {
    public static void main(String[] args) {
       String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "saturday", "Sunday"};
        int i = 0;
        int j = 0;
        int k = 0;
        System.out.print("Hari dalam seminggu    : ");
        for(i=0;i<days.length;i++){
            System.out.print(days[i] + ", ");
        }
        System.out.println();
        System.out.print("Hari dalam seminggu    : ");
        while(j<days.length){
            System.out.print(days[j] + ", ");
            j++;
        }
        System.out.println();
        System.out.print("Hari dalam seminggu    : ");
        do{
            System.out.print(days[k] + ", ");
            k++;
        }while(k<days.length);
    }
}
