package Exercicios;

public class ExercicioSwitch {
    public static void main(String[] args) {
        int Mês = 1;
        switch (Mês) {
                case 1:
                System.out.println("Janeiro " + " Possui 31 dias");
                break;
                case 2:
                    System.out.println("Fevereiro " + " Possui 28 ou 29 dias");
                    break;
                case 3:
                    System.out.println("Março " + " Possui 31 dias");
                    break;
                case 4:
                    System.out.println("Abril" + " Possui 30 dias");
                    break;
                case 5:
                    System.out.println("Maio" + " Possui 31 dias");
                    break;
                case 6:
                    System.out.println("Junho" + " Possui 30 dias");
                    break;
                case 7:
                    System.out.println("Julho" + " Possui 31 dias");
                    break;
                case 8:
                    System.out.println("Agosto" + " Possui 31 dias");
                    break;
                case 9:
                    System.out.println("Setembro" + " Possui 30 dias");
                    break;
                case 10:
                    System.out.println("Outubro" + " Possui 31 dias");
                    break;
                case 11:
                    System.out.println("Novembro" + " Possui 30 dias");
                    break;
                case 12:
                    System.out.println("Dezembro" + " Possui 31 dias");
                    break;
            default:
                System.out.println("Não existe mas meses");
        }
    }
}
