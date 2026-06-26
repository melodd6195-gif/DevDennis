package Exercicios;

// Exercício 6
//
//Crie duas variáveis int representando a nota de uma prova e a nota mínima pra passar.
// Use um operador relacional pra verificar se o aluno passou.

public class OperadoresExercicio02 {
    public static void main(String[] args) {
        String Aluno = "Dennis";
        int NotaAluno = 59;
        int NotaProva = 100;
        int NotaMinima = 60;
        boolean Passou = NotaAluno >= NotaMinima;


        System.out.println("Prova: " +NotaProva);
        System.out.println("Nota minima:" +NotaMinima);
        System.out.println("Dennis passou de ano? " +Passou);
    }
}
