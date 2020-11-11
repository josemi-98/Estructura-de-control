package Ejercicio_3;

public class Numero100_50 {
    public static void UsandoWhile(){
        int n=102;
        while (n>50) {
            n=n-2;
            System.out.println("Usando el While: " +n);
        }
    }

    public static void UsandoDo(){
        int n=102;
        do {
            n=n-2;
            System.out.println("Usando el do... while: " +n);
        } while (n>50);

    }

    public static void UsandoFor(){
        for (int i= 100; i>=50; i= i -2)
        System.out.println("Usando el for: " +i);
    }


    public static void main(String[] args) {
        UsandoWhile();
        UsandoDo();
        UsandoFor();
    }
}

