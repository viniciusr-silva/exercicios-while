// Vinicius Rodrigues da Silva - RA: 12526131212

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        for (int aluno = 1; aluno <= 5; aluno++) {

            double nota1, nota2;

            // --- Leitura e validação da primeira nota ---
            do {
                System.out.print("Digite a 1ª nota do aluno " + aluno + ": ");
                nota1 = sc.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }

            } while (nota1 < 0 || nota1 > 10);

            // --- Leitura e validação da segunda nota ---
            do {
                System.out.print("Digite a 2ª nota do aluno " + aluno + ": ");
                nota2 = sc.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }

            } while (nota2 < 0 || nota2 > 10);

            // --- Cálculo da média ---
            double media = (nota1 + nota2) / 2.0;

            System.out.println("→ A média do aluno " + aluno + " é: " + media);
            System.out.println("-----------------------------------");
        }

        sc.close();
    }
}
