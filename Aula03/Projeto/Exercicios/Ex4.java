package Projeto.Exercicios;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: ");
        double valorCompra = leitor.nextDouble();

        double percentualDesconto;

        if (valorCompra <= 100.0) {
            percentualDesconto = 0.0;
        } else if (valorCompra <= 500.0) {
            percentualDesconto = 0.10;
        } else {
            percentualDesconto = 0.15;
        }

        double valorDesconto = valorCompra * percentualDesconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.printf("Valor da compra: R$ %.2f%n", valorCompra);
        System.out.printf("Valor do desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Valor final: R$ %.2f%n", valorFinal);

        leitor.close();
    }
}
