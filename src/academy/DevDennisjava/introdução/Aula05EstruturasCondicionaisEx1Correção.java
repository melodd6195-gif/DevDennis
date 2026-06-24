package academy.DevDennisjava.introdução;

public class Aula05EstruturasCondicionaisEx1Correção {
    public static void main(String[] args) {
        double PrecoProduto = 150.00;
        int Qtd = 3;
        boolean ClienteVip = true;
        boolean FreteGratis = PrecoProduto * Qtd > 200.0;

        if (ClienteVip && FreteGratis) {
            System.out.println("Cliente Vip com frete gratis!");
        }else if (ClienteVip && !FreteGratis) {
            System.out.println("Cliente vip mais frete R$15 reias");
        } else if (!ClienteVip && FreteGratis) {
            System.out.println("Frete gratis");
        }else{
            System.out.println("Frete R$15.00");
        }
    }
    }

