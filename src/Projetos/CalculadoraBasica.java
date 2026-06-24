package Projetos;

public class CalculadoraBasica {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;
        double Resultado;
        char Operecao = '+';

        switch (Operecao) {
                case '*':
                Resultado = num1 * num2;
                System.out.println(Resultado);
                break;
            case '-':
                Resultado = num1 - num2;
                System.out.println(Resultado);
                break;
            case '+':
                Resultado = num1 + num2;
                System.out.println(Resultado);
                break;
            case '/':
                Resultado = num1 / num2;
                System.out.println(Resultado);
                break;
            default:
                System.out.println("Opcao invalida");
            break;
        }
    }
}
