import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)){
            System.out.println("Digite uma String");
            String Frase = Teclado.nextLine();
            String novaString = "";
            for(int I=0;I<Frase.length();I++){
                if(Character.isDigit(Frase.charAt(I))){
                    novaString = novaString + Frase.charAt(I);
                } 
            }
            System.out.println(novaString);
        }
    }
}
