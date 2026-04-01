// Vinicius Rodrigues da Silva - RA: 12526131212

import java.util.Scanner;

public class Lanchonete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        int quantidade;
        double preco = 0;
        double totalProduto;
        double totalGeral = 0;

        char continuar = 's'; // <<< RESOLVE O ERRO

        do {

            System.out.print("Digite o código do produto: ");
            codigo = sc.nextInt();

            switch (codigo) {
                case 100: preco = 1.20; break;
                case 101: preco = 1.30; break;
                case 102: preco = 1.50; break;
                case 103: preco = 1.20; break;
                case 104: preco = 1.30; break;
                case 105: preco = 1.00; break;
                default:
                    System.out.println("Código inválido! Digite novamente.\n");
                    continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            quantidade = sc.nextInt();

            totalProduto = preco * quantidade;
            totalGeral += totalProduto;

            System.out.println("Total do produto: R$ " + totalProduto);

            System.out.print("Deseja continuar comprando? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("\nVALOR TOTAL DA COMPRA: R$ " + totalGeral);

        sc.close();
    }
}
