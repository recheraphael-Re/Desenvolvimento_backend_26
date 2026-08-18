package Projeto;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto do tipo Aluno
        Aluno aluno1 = new Aluno();
        
        // Atribuição de valores aos atributos do objeto aluno
        aluno1.nome = "Lucas";
        aluno1.idade = 18;
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 6.5;
        
        // Apresentação do aluno
        aluno1.apresentar();
        
        
        
        // Exibição dos resultados
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    }
    
}
