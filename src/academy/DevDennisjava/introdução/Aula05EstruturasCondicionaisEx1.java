package academy.DevDennisjava.introdução;

public class Aula05EstruturasCondicionaisEx1 {
    public static void main(String[] args) {
        double PreçoProduto = 150.00;
        int Qtd = 3;
        double Desconto = 25.0;
        boolean ClienteVip = false;
        boolean FreteGratis = true;

        if(ClienteVip) {
            PreçoProduto *= 0.85;
            System.out.println("Desconto de 15% aplicado para o cliente vip: " +PreçoProduto);
            System.out.println("Frete gratis: " +FreteGratis);
        }else{

            System.out.println("Preco para o cliente sem vip:" +PreçoProduto);
            System.out.println("Frete R$15.00");
        }
    }
}
