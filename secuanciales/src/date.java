import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class date {
    public static void main(String[] args) throws Exception {
        DecimalFormat formateador = new DecimalFormat();
        float util, sal;
        int ant;

        ant = Integer.parseInt(JOptionPane.showInputDialog("Digite la antiguedad"));
        sal = Float.parseFloat(JOptionPane.showInputDialog("digite el salario del empleado"));

        if (ant <= 1) {
            util = (float) (sal * 0.05);
            JOptionPane.showMessageDialog(null, "el porcentaje de utilidad es de 5%");
        } else {
            if (ant > 1 && ant <= 2) {
                util = (float) (sal * 0.07);
                JOptionPane.showMessageDialog(null, "el porcentaje de utilidad es de 10%");
            } else {
                if (ant >= 2 && ant < 5) {
                    util = (float) (sal * 0.10);
                    JOptionPane.showMessageDialog(null, "el porcentaje de utilidad es de 15%");
                } else {
                    if (ant >= 5 && ant <= 10) {
                        util = (float) (sal * 0.15);
                        JOptionPane.showMessageDialog(null, "el porcentaje de utilidad es de 20%");
                    } else {
                        util = (float) (sal * 0.20);
                        JOptionPane.showMessageDialog(null, "el porcentaje de utilidad es de 30% hola");
                    }
                }
            }
            JOptionPane.showMessageDialog(null,
                    "La antiguedad es de " + ant + "años" + "\n y la utilidad es de " + "$" + formateador.format(util)
                            + "\n su salario es de " + formateador.format(sal));

        }
    }
}