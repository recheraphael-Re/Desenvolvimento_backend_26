// Exmplo de Programa Java

// importar a biblioteca do Scanner
import java.util.Scanner; // Permite a leitura de dados do teclado

public class Main {

    //cria uma função publica chamada main
    public static void main(String[] args) {
        //cria um objeto chamado scanner do tipo Scanner, permite a leitura de dados do teclado
        Scanner scanner = new Scanner(System.in);

        //exibe uma mensagem na tela pedindo para o usuário digitar seu nome
        System.out.print("Digite seu nome: ");

        //lê o nome digitado pelo usuário e armazena na variável nome
        String nome = scanner.nextLine();

        //exibe uma mensagem de boas-vindas com o nome do usuário
        System.out.print("Digite a primeira nota"); // mensagem no terminal pedindo para o usuário digitar a primeira nota
        double nota1 = scanner.nextDouble(); // lê a primeira nota digitada pelo usuário e armazena na variável nota1
        System.out.print("Digite a segunda nota"); // mensagem no terminal pedindo para o usuário digitar a segunda nota
        double nota2 = scanner.nextDouble(); // lê a segunda nota digitada pelo usuário e armazena na variável nota2    
        double media = (nota1 + nota2) / 2; // calcula a média das duas notas e armazena na variável media
        System.out.println("\n Aluno" + nome); // exibe a média do aluno na tela
        System.out.println("Média: " + media); // exibe a média do aluno na tela

        if (media >= 7) { // verifica se a média é maior ou igual a 7
            System.out.println("Aprovado"); // exibe a mensagem "Aprovado" na tela
        } else if (media >= 5) { // verifica se a média é maior ou igual a 5
            System.out.println("Recuperação"); // exibe a mensagem "Recuperação" na tela
        } else { // caso contrário
            System.out.println("Reprovado"); // exibe a mensagem "Reprovado" na tela
        }
    }


}