public class Calculadora {
   // criando o primeiro método chamado somar, que recebe dois parâmetros do tipo double e retorna a soma dos dois números
    public class CalculadoraNotas {
        public static double calcularMedia(double nota1, double nota2) {
            return (nota1 + nota2) / 2;
        }

        // Cria o metod para verificar a situação do aluno com base na média calculada
        public static String verificarSituacao(double media) {
            if (media >= 7) {
                return "Aprovado";
            } else if (media >= 5) {
                return "Recuperação";
            } else {
                return "Reprovado";
            }
        }
        // Cria metodo chamdo exibir resultados

        public static void exibirResultados(String nome, double media, String situacao) {
            System.out.println("\nAluno: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Situação: " + situacao);
        }
        // Cria o método principal main para executar o programa
        public static void main(String[] args) {
            String nome = "João"; // Nome do aluno
            double nota1 = 8.5; // Primeira nota
            double nota2 = 6.5; // Segunda nota

            double media = calcularMedia(nota1, nota2);
            String situacao = verificarSituacao(media);
            exibirResultados(nome, media, situacao);
        }
    }
}
