import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class exercise {
    public static void main(String[] args) throws Exception {
        int hora, extras, total;
        NumberFormat dato = NumberFormat.getCurrencyInstance();
        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu hora"));

        if (hora <= 40) {
            JOptionPane.showMessageDialog(null, "tu sueldo es: " + hora * 15000);

        } else {
            extras = hora - 40;
            total = (40 * 15000) + (extras * 20000);
            JOptionPane.showMessageDialog(null, "tu sueldo es: " + dato.format(total));
        }

    }
}
