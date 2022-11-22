import java.util.Scanner;

public class scanner {
    public static void main(String[] args) throws Exception {
        String fruta;
        try (Scanner f = new Scanner(System.in)) {
            System.out.print("Enter the name of the fruit ");

            fruta = f.nextLine();
        }

        if (("manzana".equalsIgnoreCase(fruta)) || ("Manzana".equals(fruta))) {
            System.out.println("the apple is sweet");

        } else {
            if ("naranja".equalsIgnoreCase(fruta)) {
                System.out.println("the orange have vitamine C");

            } else {
                if ("pera".equalsIgnoreCase(fruta)) {
                    System.out.println("the pear is a refreshing and sweet fruit");

                } else {
                    if ("mango".equalsIgnoreCase(fruta)) {
                        System.out.println("the mango is a fruit that contains fiber ");

                    } else {
                        System.out.println("no there this fruit");
                    }

                }
            }

        }

    }

}
