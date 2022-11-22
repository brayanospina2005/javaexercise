import javax.swing.JOptionPane;

public class aprobo {
    public static void main(String[] args) throws Exception {
        Float nota1, nota2, nota3;
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("enter note 1"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("enter note 2"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("enter note 3"));

        if ((nota1 + nota2 + nota3) / 3 > 3.4) {
            JOptionPane.showMessageDialog(null, "Your Win", "exam", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Your Lose");
        }

    }
}
