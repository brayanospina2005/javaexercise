import javax.swing.JOptionPane;

public class condicional {
    public static void main(String[] args) throws Exception {
        int age;
        age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));

        if (age >= 70) {
            JOptionPane.showMessageDialog(null, "you are of the third age");
        } else {
            if (age >= 18) {
                JOptionPane.showMessageDialog(null, "you are more than 18 years old");
            } else {
                JOptionPane.showMessageDialog(null, "you are less than 18 years old");
            }
        }

    }
}
