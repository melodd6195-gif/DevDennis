package Exercicios;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        Double Salario = 30000.0;
        String Mensagem = "Dennis e rico";
        String Mensagemnão = "Dennis não é rico mas vai ser";

        String Resultado = Salario > 20000 ? Mensagem : Mensagemnão;
        System.out.println(Resultado);

    }
}
