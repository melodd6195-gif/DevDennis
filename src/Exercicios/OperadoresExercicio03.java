package Exercicios;

//Crie três variáveis boolean representando se uma pessoa tem mais de 18 anos,
// se tem documento, e se tem ingresso.
// Combine os três com && pra saber se ela pode entrar no evento.

public class OperadoresExercicio03 {
    public static void main(String[] args) {
        int Idade = 18;
        boolean TemDocumento = true;
        boolean TemIngresso = true;
        boolean Permitido = Idade >= 18 && TemDocumento && TemIngresso;

        System.out.println("Idade: " +Idade);
        System.out.println("Tem documento? " +TemDocumento);
        System.out.println("Tem Ingresso? " +TemIngresso);
        System.out.println("Entrada: "+Permitido);
    }
}
