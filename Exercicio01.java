import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("Digite uma frase");
            String Frase = Teclado.nextLine();
            while(Frase.length() < 10){
                if(Frase.length() < 10){
                    System.out.println("Frase invalida\n");  
                    System.out.println("Digite outra frase");  
                }
                Frase = Teclado.nextLine();
             }
        }
    }
}
