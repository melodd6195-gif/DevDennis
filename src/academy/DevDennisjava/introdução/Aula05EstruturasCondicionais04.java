package academy.DevDennisjava.introdução;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        int Idade = 18;
        boolean TemIngresso = true;
        if (TemIngresso && Idade >= 18) {
            System.out.println("Permitido entrar no show");
        }else{
            System.out.println("Não pode entrar no show");
        }
    }
}
