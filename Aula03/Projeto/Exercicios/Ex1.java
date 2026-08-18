package Projeto.Exercicios;

public class Ex1{
    public static void main(String[] args) {
        double numero1 = 10.0;
        double numero2 = 5.0;

        double soma = somar(numero1, numero2);
        double subtracao = subtrair(numero1, numero2);
        double multiplicacao = multiplicar(numero1, numero2);
        double divisao = dividir(numero1, numero2);

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }

    public static double somar(
        double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double subtrair(
        double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(
        double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(
        double numero1, double numero2) {
        return numero1 / numero2;
    }

}
