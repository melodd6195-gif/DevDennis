package academy.DevDennisjava.introdução;

import java.sql.SQLOutput;

public class aula02TiposPrimitivos {
    public static void main(String[] args) {
        // tipos primitivos //
        // int, double, float, char, byte, short, long, boolean
        int Idade = 10;
        long NumeroGrande = 10000;
        double SalarioDouble = 2000;
        float SalarioFloat = 2500;
        byte IdadeByte = 127;
        short IdadeShort = 10;
        boolean Ativo = true;
        boolean Falso = false;
        char caracter = 63;
        String nome = "Dennis";

        System.out.println("A idade é: "+Idade+" Anos");
        System.out.println(Ativo);
        System.out.println("Char " +caracter);
        System.out.println("Meu nome é:"+nome);
    }
}
