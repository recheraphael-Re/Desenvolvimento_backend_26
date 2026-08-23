package Projeto.Exercicios;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = leitor.nextDouble();

        boolean continuar = true;

        while (continuar) {
            System.out.println();
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = leitor.nextDouble();

                    if (valorDeposito > 0) {
                        saldo = saldo + valorDeposito;
                        System.out.printf("Depósito realizado. Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = leitor.nextDouble();

                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido");
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorSaque;
                        System.out.printf("Saque realizado. Saldo: R$ %.2f%n", saldo);
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        leitor.close();
    }
}
