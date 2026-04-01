// Vinicius Rodrigues da Silva - RA: 12526131212

import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;
        int pessoasNormais = 0;

        do {
            System.out.println("Pessoa " + (contador + 1));

            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();

            double imc = peso / (altura * altura);

            System.out.printf("IMC: %.2f\n", imc);

            if (imc >= 18.5 && imc <= 24.9) {
                pessoasNormais++;
            }

            contador++;

            System.out.println();

        } while (contador < 10);

        System.out.println("Quantidade de pessoas com IMC normal: " + pessoasNormais);

        scanner.close();
    }
}
