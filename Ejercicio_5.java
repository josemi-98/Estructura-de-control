package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args)
    {
        int i, sum=0;

        int N;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        N = sc.nextInt();

        for(i=1;i<=N;i++)
        sum=sum+i*i;
    System.out.println("La suma de los cuadrados es: " +sum );
    }
}
