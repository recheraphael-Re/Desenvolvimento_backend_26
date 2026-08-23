package Projeto.Exercicios;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("1 - Hambúrguer        R$ 20,00");
        System.out.println("2 - Pizza             R$ 35,00");
        System.out.println("3 - Cachorro-quente   R$ 15,00");
        System.out.println("4 - Refrigerante      R$ 8,00");

        System.out.print("Escolha uma opção: ");
        int opcao = leitor.nextInt();

        String produto;
        double preco;

        switch (opcao) {
            case 1:
                produto = "Hambúrguer";
                preco = 20.0;
                break;
            case 2:
                produto = "Pizza";
                preco = 35.0;
                break;
            case 3:
                produto = "Cachorro-quente";
                preco = 15.0;
                break;
            case 4:
                produto = "Refrigerante";
                preco = 8.0;
                break;
            default:
                produto = null;
                preco = 0.0;
                break;
        }

        if (produto == null) {
            System.out.println("Opção inválida");
        } else {
            System.out.println("Produto: " + produto);
            System.out.printf("Preço: R$ %.2f%n", preco);
        }

        leitor.close();
    }
}
