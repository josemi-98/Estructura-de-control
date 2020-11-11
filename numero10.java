package Ejercicio_1;

public class numero10 {

    public static void UsandoWhile(){
        int n=0;
        while (n<10) {
            n++;
            System.out.println("Usando el While: " +n);
        }
    }

    public static void UsandoDo(){
        int n=0;
        do {
            n++;
            System.out.println("Usando el do... while: " +n);
        } while (n<10);

    }

    public static void UsandoFor(){
        for (int i= 1; i<=10; i++) {
            System.out.println("Usando el for: " + i);
        }

    }


    public static void main(String[] args) {
        UsandoWhile();
        UsandoDo();
        UsandoFor();

    }
}