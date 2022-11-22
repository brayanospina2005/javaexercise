import javax.swing.JOptionPane;

public class lista2 {
    public static void main(String[] args) throws Exception {
        String[] operations = { "Sum", "Rest", "Multiplication", "Divition" };
        String option = (String) JOptionPane.showInputDialog(null, "Select a option", "Operation",
                JOptionPane.INFORMATION_MESSAGE, null, operations, operations[0]);

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number", 1));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number", 2));

        if (option == operations[0]) {
            JOptionPane.showMessageDialog(null, "The sum is: " + (n1 + n2));
        }
        if (option == operations[1]) {
            JOptionPane.showMessageDialog(null, "The rest is: " + (n1 - n2));
        }
        if (option == operations[2]) {
            JOptionPane.showMessageDialog(null, "The multiplication is: " + (n1 * n2));
        }
        if (option == operations[3]) {
            JOptionPane.showMessageDialog(null, "The divition is: " + (n1 / n2));
        }
    }

}
