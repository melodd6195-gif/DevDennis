package academy.DevDennisjava.introdução;

public class OperadoresExercicio01 {
    public static void main(String[] args) {
        int Idade = 61;
        boolean ehAniversario = false;

        boolean Desconto = Idade >= 60 || ehAniversario;

        System.out.println("Idade:" +Idade);
        System.out.println("É aniversario:" + ehAniversario);
        System.out.println("Tem desconto " +Desconto);
    }
}
