//seria possivel utilizar tbm o
//private static final double PI = Math.PI;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            float Raio = Teclado.nextFloat();
            double Circunferencia = Math.PI*Math.pow(Raio, 2);
            
            System.out.printf("%.2f", Circunferencia);
            }
        }
}
