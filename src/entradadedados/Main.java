package entradadedados;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z);

        char c;
        c = sc.next().charAt(0);
        System.out.println("Você digitou: " + c);*/

        System.out.println("Digite duas linhas:");
        String linha1, linha2;
        linha1 = sc.nextLine();
        linha2 = sc.nextLine();
        System.out.println("Você digitou:");
        System.out.println(linha1);
        System.out.println(linha2);


        sc.close();
    }
}
