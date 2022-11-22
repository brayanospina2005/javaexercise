import javax.swing.JOptionPane;

public class ventana {
    public static void main(String[] args) throws Exception {
        Float n1, n2, n3, prom;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("enter your note"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("enter your note"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("enter your note"));
        prom = (n1 + n2 + n3) / 3;
        if (prom >= 3.4) {
            JOptionPane.showMessageDialog(null, "Your prom is " + prom);
            JOptionPane.showMessageDialog(null, "you win", "winner", JOptionPane.CANCEL_OPTION);

        } else {
            JOptionPane.showMessageDialog(null, "you lose", "loser", JOptionPane.WARNING_MESSAGE);
        }

        /*
         * String title="promedio";
         * JOptionPane.showMessageDialog(null,"Your prom is " + "\n" + prom, title, 0);
         */
    }
}