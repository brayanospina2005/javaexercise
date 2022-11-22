import java.util.Scanner;
import javax.swing.JOptionPane;

public class multiplicacion {
    public static void main(String[] args) throws Exception {
        int n, i;
        String chat = "";
        n = Integer.parseInt(JOptionPane.showInputDialog(" insert a number "));
        for (i = 0; i <= 10; i++) {
            chat += i + "x" + n + " = " + i * n + "\n";
        }
        JOptionPane.showMessageDialog(null, "La tabla de multiplicaion es \n " + chat, "tablas",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
