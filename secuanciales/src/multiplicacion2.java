

import java.util.Scanner;

public class multiplicacion2 {
    public static void main(String[] args) throws Exception{
        int num, i, mul;

        Scanner dato= new Scanner(System.in);
        System.out.println("Inser a number");
        num = dato.nextInt();
        for (i=0; i<=10; i++){
            System.out.println("La tabla de: "+i+"*"+num+ " es "+i*num);
        }
    }
}

    
