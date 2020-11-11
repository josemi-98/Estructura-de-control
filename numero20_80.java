package Ejercicio_2;

public class numero20_80 {
    public static void UsandoWhile(){
        int n=15;
        while (n<80) {
            n=n+5;
            System.out.println("Usando el While: " +n);
        }
    }

    public static void UsandoDo(){
        int n=15;
        do {
            n=n+5;
            System.out.println("Usando el do... while: " +n);
        } while (n<80);

    }

    public static void UsandoFor(){
        for (int i = 20; i<=80; i = i +5)
        System.out.println("Usando el for: " +i);
    }


    public static void main(String[] args) {
        UsandoWhile();
        UsandoDo();
        UsandoFor();
    }

}