package Exercicios;

public class Aula06EstruturasDeRepeticaoEx01 {
    public static void main(String[] args) {
        for (int cont = 0; cont < 1000000; cont++) {
            if (cont % 2 == 0) {
                System.out.println("Par: " + cont);
            }
      }
    }
}
