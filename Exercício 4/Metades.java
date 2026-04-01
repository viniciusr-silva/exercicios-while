// Vinicius Rodrigues da Silva - RA: 12526131212

public class Metades {
    public static void main(String[] args) {

        int numero = 10;

        do {
            double metade = numero / 2.0;
            System.out.println("A metade de " + numero + " é " + metade);
            numero++;
        } while (numero <= 20);
    }
}