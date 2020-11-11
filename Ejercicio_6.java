package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int i, sp = 0, si = 0;

        int N;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        N = sc.nextInt();

        for (i = 1; i <= N; i++)
            if (i % 2 == 0) sp = sp + i;
            else si = si + i;
        System.out.println("La suma de pares es : " + sp);
        System.out.println("La suma de impares es : " + si);
    }
}
