import java.util.Scanner;

public class Exercicio09{
    public static void main(String[] args) {
        try (Scanner Teclado = new Scanner(System.in)) {
            System.out.println("Digite os lados do triangulo: ");
            Triangulo triangulo = new Triangulo(Teclado.nextFloat(), Teclado.nextFloat(), Teclado.nextFloat());
            int Resultado = triangulo.tipo();

            if(Resultado == 1){
                System.out.println("Triangulo escaleno");
            }else if(Resultado == 2){
                System.out.println("Triangulo Isosceles");
            }else if(Resultado == 3){
                System.out.println("Triangulo equilatero");
            }

            System.out.println("Perimetro:"+ triangulo.calculaPerimetro());
            System.out.printf("Area: %.2f",  triangulo.calculaArea());
        }
    }
}

class Triangulo {
    private float L1, L2, L3;
    
    public Triangulo(float L1, float L2, float L3){
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }
    public float calculaPerimetro(){
        float Perimetro = L1+L2+L3;
        return Perimetro;
    }
    
    public float calculaArea(){
        float semiP = calculaPerimetro()/2;
        float Area = (float) Math.sqrt(semiP * (semiP-L1) * (semiP-L2) * (semiP-L3));
        return Area;
    }

    public int tipo(){
        if(L1 != L2 && L1 != L3 && L2 != L3){
            return 1;
        } else if(L1 == L2 && L1 == L3){
                return 3;
        }else if(L1 == L2 || L2 == L3 || L3 == L1){
            return 2;
        }
    return 0;
    }
}
