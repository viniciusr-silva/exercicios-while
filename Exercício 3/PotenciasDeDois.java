// Vinicius Rodrigues da Silva - RA: 12526131212

import java.util.Scanner;

public class PotenciasDeDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int valor = 1;

        while (valor <= numero) {
            System.out.print(valor + " ");
            valor = valor * 2; // dobra o valor
        }

        scanner.close();
    }
}