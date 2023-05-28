import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        try(Scanner Teclado = new Scanner(System.in)){
        String Frase = Teclado.nextLine();
            if(url(Frase)==true){
                System.out.println("Verdadeiro");
            }
            else{
                System.out.println("Falso");
            }
        }
    }
    public static boolean url(String Link){
        if(Link.startsWith("http:") || Link.startsWith("ftp:")){
            return true;
        }
        else{
            return false;
        }
    }

}
