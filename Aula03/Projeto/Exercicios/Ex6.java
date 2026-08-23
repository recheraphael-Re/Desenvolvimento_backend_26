package Projeto.Exercicios;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = leitor.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        double altura = leitor.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25.0) {
            classificacao = "Peso normal";
        } else if (imc < 30.0) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }

        System.out.printf("IMC: %.2f%n", imc);
        System.out.println("Classificação: " + classificacao);

        leitor.close();
    }
}
