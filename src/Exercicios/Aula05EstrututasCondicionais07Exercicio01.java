package Exercicios;

public class Aula05EstrututasCondicionais07Exercicio01 {
    public static void main(String[] args) {
        // dados os valores de 1 a 7, imprima se e dia util ou final de semana considerando
       // 1 como domingo
          byte dia = 1;
          switch (dia) {
              case 1:
                  System.out.println("Dom" + " final de semana");
                  break;
              case 2:
                  System.out.println("seg" + " dia util");
                  break;
              case 3:
                  System.out.println("ter" + " dia util");
                  break;
              case 4:
                  System.out.println("qua" + " dia util");
                  break;
              case 5:
                  System.out.println("qui" + " dia util");
                  break;
              case 6:
                  System.out.println("sex" + " dia util");
                  break;
              case 7:
                  System.out.println("sab" + " final de semana");
                  break;
              default:
                  System.out.println("Opcao invalida");
                  break;
          }
    }
}
