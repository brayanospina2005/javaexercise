import javax.swing.JOptionPane;

public class tarea {
    public static void main(String[] args) throws Exception {
        Double Green = 0.10, Yellow = 0.25, Blue = 0.50, Red = 1.00;
        String[] options = { "Green", "Yellow", "Blue", "Red" };
        String option = (String) JOptionPane.showInputDialog(null, "Select a option", "Colors",
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        String Name = (String) JOptionPane.showInputDialog("Insert Your Name");
        Float value = Float.parseFloat(JOptionPane.showInputDialog("Insert The value Of the shopping"));
        JOptionPane.showMessageDialog(null, "The color is " + option, "Color", 0);
        if (option == options[0]) {
            JOptionPane.showMessageDialog(null, "hi " + Name + " \n Tu Descuento es " + 10 + "%"
                    + " \n Tu total a pagar  es " + (value - (value * Green)));
        }
        if (option == options[1]) {
            JOptionPane.showMessageDialog(null, "hi " + Name + " \n Tu Descuento es " + 25 + "%"
                    + " \n Tu total a pagar  es " + (value - (value * Yellow)));
        }
        if (option == options[2]) {
            JOptionPane.showMessageDialog(null, "hi " + Name + " \n Tu Descuento es " + 50 + "%"
                    + " \n Tu total a pagar  es " + (value - (value * Blue)));
        }
        if (option == options[3]) {
            JOptionPane.showMessageDialog(null, "hi " + Name + " \n Tu Descuento es " + 100 + "%"
                    + " \n Tu total a pagar  es " + (value - (value * Red)));
        }
    }
}
