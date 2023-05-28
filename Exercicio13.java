import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            String Frase = Teclado.nextLine();

            if(stringHelp(Frase)){
                System.out.println("Contem codigo de ajuda");
            }
            else{
                System.out.println("Nao contem codigo de ajuda");
            }
        }
    }
    
    public static boolean stringHelp(String Frase){
        if(Frase.contains("-help") || Frase.contains("-h")){
            return true;
        }
        return false;
    }
}
