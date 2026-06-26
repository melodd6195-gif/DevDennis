package Exercicios;

public class Aula05EstruturasCondicionais07 {
    public static void main(String[] args) {
        // Imprima o Dia da semana, considerando domingo dia 1
        byte Dia = 8;
        switch (Dia) {
            case 1:
                System.out.println("Dom");
                break;
                case 2:
                System.out.println("Seg");
                break;
                case 3:
                System.out.println("ter");
                break;
                case 4:
                System.out.println("qua");
                break;
                case 5:
                System.out.println("qui");
                ;break;
                case 6:
                System.out.println("sex");
                break;
                case 7:
                System.out.println("sab");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
