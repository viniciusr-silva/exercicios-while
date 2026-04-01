// Vinicius Rodrigues da Silva - RA: 12526131212

import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int numero;
        int menor = Integer.MAX_VALUE; // começa com o maior valor possível

        while (contador <= 10) {
            System.out.print("Digite o " + contador + "º número positivo: ");
            numero = scanner.nextInt();

            // garante número positivo
            while (numero < 0) {
                System.out.print("Valor inválido! Digite um número POSITIVO: ");
                numero = scanner.nextInt();
            }

            if (numero < menor) {
                menor = numero;
            }

            contador++;
        }

        System.out.println("O menor número digitado foi: " + menor);

        scanner.close();
    }
}