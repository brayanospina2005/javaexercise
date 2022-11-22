import java.util.Scanner;

public class promedio {
   
    public static void main(String[] args) throws Exception {
        double a,b,c;
        Scanner date= new Scanner (System.in);
        System.out.println("enter a date");
        a=date.nextDouble();
        System.out.println("enter b");
        b=date.nextDouble();
        System.out.println("enter c");
        c=date.nextDouble();
        System.out.println("the prom is "+(a+b+c)/3);
    }

    
}
