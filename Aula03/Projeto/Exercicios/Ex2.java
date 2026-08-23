package Projeto.Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Olá, " + nome + "!");

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if (idade < 18) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }

        leitor.close();
    }
}
