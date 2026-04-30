
package pbo_rafli;
import javax.swing.*;

public class Latihan_1_BufferedReader {
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "";
        String word3 = "";
        
        word1 = JOptionPane.showInputDialog("Enter word 1");
        word2 = JOptionPane.showInputDialog("Enter word 2");
        word3 = JOptionPane.showInputDialog("Enter word 3");
        
        String msg;
        msg =  word1 + " " + word2 + " " + word3;
        JOptionPane.showMessageDialog(null, msg);

    }
}
