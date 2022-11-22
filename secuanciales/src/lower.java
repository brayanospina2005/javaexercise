import javax.swing.JOptionPane;

public class lower {
    public static void main(String[] args) throws Exception {
        String fruta, name;

        name = String.format(JOptionPane.showInputDialog("enter your name "));

        fruta = String.format(JOptionPane.showInputDialog("Insert the name of the fruit").toLowerCase());

        if ("manzana".equalsIgnoreCase(fruta)) {
            JOptionPane.showMessageDialog(null, "Apple is Sweet");
            JOptionPane.showMessageDialog(null, "HI " + name.toUpperCase());

        } else {
            if ("naranja".equalsIgnoreCase(fruta)) {
                JOptionPane.showMessageDialog(null, "Orange have vitimine C");
                JOptionPane.showMessageDialog(null, "HI " + name.toUpperCase());
            } else {
                JOptionPane.showMessageDialog(null, "No there this fruit");

            }
        }

    }

}
