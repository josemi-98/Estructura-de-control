package Ejercicio_4;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        int sum=0;
        int N;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero: ");
        N = sc.nextInt();

        for(int i=1;i<=N;i++) sum=sum+i;
        System.out.println("La suma es : "+sum);
    }
}
