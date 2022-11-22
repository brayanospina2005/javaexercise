
import java.util.Scanner;

public class ciclowhile {
    public static void main(String[] args) {
        int i=0, num, mul;
        Scanner dato = new Scanner(System.in);
        System.out.print("Insert a number ");
        num= dato.nextInt();
        do {
            System.out.println(num+ "X"+i+"="+num*i);
            i++;
        }while (i<=10);
    }
}
