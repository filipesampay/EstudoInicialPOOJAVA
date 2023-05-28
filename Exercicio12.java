import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        String[] Frases = new String[10];
        Scanner Teclado = new Scanner(System.in);
        int Numero = Teclado.nextInt();
        Teclado.nextLine();
        for(int I=1;I<=Numero;I++){
        Frases[I] = Teclado.nextLine();
        }
        
        Teclado.close();
    
        verificaString(Frases, Numero);  
    }


    public static void verificaString(String Frase[], int Numero){
        int Length;
        System.out.println();
        for(int I=1;I<=Numero;I++){
            Length = Frase[I].length();
            if(Length < 10){
                String FraseCompleta = "*".repeat(10 - Length);
                System.out.println(Frase[I]+FraseCompleta);
            }
            else{
                System.out.println(Frase[I]);
            }
        }
    }
}
