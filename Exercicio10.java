import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        int Numeros[] = new int[50];
        int TAM = Numeros.length;
        System.out.println("Sorteando numeros: ");
        sorteio(Numeros, TAM);

        for(int I=0;I<TAM;I++){
            System.out.println(" <"+Numeros[I]+"> ");
        }
    }

    public static void sorteio(int Numeros[], int TAM){
        Random Numero = new Random();
        for(int I=0;I<TAM;I++){
            int Gerado = Numero.nextInt(100);
            while (contemNumero(Numeros, Gerado, TAM)){
                Gerado = Numero.nextInt(100);
            }
            Numeros[I] = Gerado;
        }
    }

    public static boolean contemNumero(int Numeros[], int Numero, int TAM){
        for(int I=0;I<TAM;I++){
            if(Numeros[I] == Numero){
                return true;
            }
        }
        return false;
    }
}
