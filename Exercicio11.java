import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        int Contador = 0;
        boolean Array[] = new boolean[5];
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("digite true or false");
            for(int I=0;I<5;I++){
                Array[I] = Teclado.nextBoolean();
            }
        }

        for (boolean Numero : Array) {
            if(Numero){
                Contador++;
            }
        }
        System.out.printf("\nO vetor possui %d valores true", Contador);
    }
}
