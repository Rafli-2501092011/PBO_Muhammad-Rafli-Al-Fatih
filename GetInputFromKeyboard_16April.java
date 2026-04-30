 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_rafli;
import java.io.*;
 
public class GetInputFromKeyboard_16April { 
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String name = "";
        String alamat = "";

        try {
            System.out.print("Please Enter Your Name: ");
            name = dataIn.readLine();
            System.out.print("Alamat: ");
            alamat = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("----------------------------");
        System.out.println("Hello " + name + "!");
        System.out.println("Alamat : " + name);
    }
}
