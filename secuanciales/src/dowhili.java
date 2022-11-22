import java.util.Scanner;

public class dowhili {
    public static void main(String[] args) throws Exception {
        int num, i = 0;
        System.out.println("enter a number");
        Scanner option = new Scanner(System.in);
        num = option.nextInt();

        do {
            System.out.println(num * i);
            i++;
        } while (i < 10);

    }

}
