package academy.DevDennisjava.introdução;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        int Idade = 14;
        if (Idade < 15){
            System.out.println("Categoria infantil");
        }else if (Idade >= 15 && Idade < 18) {
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulta");
        }
    }
}
