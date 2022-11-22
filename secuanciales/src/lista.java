import javax.swing.JOptionPane;

public class lista {
    public static void main(String[] args) throws Exception {
        String[] genres = { "Masculine", "Feminine", "LGBT" };
        String sexo = (String) JOptionPane.showInputDialog(null, "select your genre", "Genre",
                JOptionPane.INFORMATION_MESSAGE, null, genres, genres[0]);
        if (sexo.equalsIgnoreCase(genres[0])) {
            JOptionPane.showMessageDialog(null, "You are man");
        }
        if (sexo.equalsIgnoreCase(genres[1])) {
            JOptionPane.showMessageDialog(null, "You are woman");
        }
        if (sexo.equalsIgnoreCase(genres[2])) {
            JOptionPane.showMessageDialog(null, "You are ¿?");
        }

    }
}
