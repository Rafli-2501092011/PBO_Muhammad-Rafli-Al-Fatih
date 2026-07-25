package pbo_rafli;
import java.io.*;

public class Latihan_2_JOptionPane {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        String word1 = "";
        String word2 = "";
        String word3 = "";

        try {
            System.out.print("Enter word 1: ");
            word1 = dataIn.readLine();
            System.out.print("Enter word 2: ");
            word2 = dataIn.readLine();
            System.out.print("Enter word 3: ");
            word3 = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("----------------------------");
        System.out.println(word1 + " " + word2 + " " + word3);
    }
}
