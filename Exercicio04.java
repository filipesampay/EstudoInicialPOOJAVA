import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        try (Scanner Leitor = new Scanner(System.in)) {
            System.out.print("Digite uma string: ");
            String Frase = Leitor.nextLine();
            String Vogais = "AEIOU"; 

            for(int I=0; I<Frase.length(); I++){
                if(Vogais.toLowerCase().indexOf(Frase.toLowerCase().charAt(I))!= -1){
                    System.out.print("?");
                }
                else{
                    System.out.print(Frase.charAt(I));
                }
            }
        }
    }    
}
