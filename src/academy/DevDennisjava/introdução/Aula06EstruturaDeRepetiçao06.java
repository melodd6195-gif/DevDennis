package academy.DevDennisjava.introdução;

public class Aula06EstruturaDeRepetiçao06 {
    public static void main(String[] args) {
        //while, do while, for
        int Cont = 0;
        while (Cont < 10) {
            System.out.println(Cont);
            Cont += 1;
        // Definimos uma variavel que recebe o valor de zero, colocamos ela no while para ela
        // repetir 10 vezes, depois logo embaixo colocamos cont adicionar mais 1, pra que faça
        // a contagem em ordem 1,2,3,4...
         Cont = 0;
        do {
            System.out.println("Dentro do do-while" + ++Cont);
        }while (Cont < 10);

        // for

        for (Cont = 0; Cont < 10; Cont++) {
            System.out.println("for "+ +Cont);
        }
        }
    }
}
