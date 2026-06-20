package academy.DevDennisjava.introdução;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos //
        // +, -, /, *
        int Num1 = 40;
        double Num2 = 30;

        double resultado1 = Num1 + Num2;
        double resultado2 = Num1 - Num2;
        double resultado3 = Num1 / Num2;
        double resultado4 = Num1 * Num2;

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 20 < 10;
        boolean isDezIgualQueVinte = 20 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;


        System.out.println("isDezMaiorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte " + isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte " + isDezDiferenteQueVinte);

        // Operadores Logicos //
        // && (AND), || (or) !
        int Idade = 35;
        float Salario = 5000F;
        boolean DentroDaLeiMaiorQueTrinta = Idade > 30 && Salario >= 4612;
        boolean DentroDaLeiMenorQueTrista = Idade < 30 && Salario >= 3381;

        System.out.println("Dentro da lei maior que trinta: " +DentroDaLeiMaiorQueTrinta);
        System.out.println("Dentro da lei menor que trinta: " +DentroDaLeiMenorQueTrista);

        double ContaCorrente = 200;
        double ContaPoupanca = 10000;
        float Ps5 = 5000F;
        boolean isPs5Compravel = ContaCorrente >= Ps5 || ContaPoupanca > Ps5;

        System.out.println("Ps5 compravel:" +isPs5Compravel);

        // =, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++. -- //
        int contador = 0;
        contador++;
        contador--;

        System.out.println(++contador);
    }
}
