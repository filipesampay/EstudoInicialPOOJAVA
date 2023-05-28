import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("Digite uma string e um numero");
            String Frase = Teclado.nextLine();
            int Numero = Teclado.nextInt();
            System.out.println("");
            if(Numero > Frase.length()){
                System.out.println("Numero invalido");
                return;
            }

            for(int I=0;I<Numero;I++){
                System.out.print(Frase.charAt(I));
            }
        }
    }
}
