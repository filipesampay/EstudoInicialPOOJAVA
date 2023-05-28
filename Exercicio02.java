import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        System.out.println("Digite uma frase: ");
        try (Scanner Teclado = new Scanner(System.in)) {
            String Frase = Teclado.nextLine();

            for(int I=0;I<Frase.length();I++){
                System.out.println(Frase.charAt(I));
            }
        }
    }
}
