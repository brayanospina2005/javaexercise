import java.util.Scanner;

public class porcentaje {
    public static void main(String[] args) throws Exception {
        float precio;
        try (Scanner price = new Scanner(System.in)) {
            System.out.println("enter a price");
            precio=price.nextFloat();
        }
        System.out.println("el porcentaje es "+ (precio*25)/100);
    }
        
}
    

