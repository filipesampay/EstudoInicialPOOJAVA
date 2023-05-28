import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        for(int I=0;I<15;I++){
        System.out.println("Dado: " + Dado.arremesso());
        }
    }
}

class Dado {
    public static int arremesso() {
        Random sorteio = new Random();
        int resultado = sorteio.nextInt(6) + 1;
        return resultado;
    }
}
