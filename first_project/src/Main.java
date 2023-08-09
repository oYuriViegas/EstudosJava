import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação (digite o símbolo correspondente):");
        System.out.println("+ : Adição");
        System.out.println("- : Subtração");
        System.out.println("* : Multiplicação");
        System.out.println("/ : Divisão");

        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida.");
                operacaoValida = false;
                break;
        }

        if (operacaoValida) {
            System.out.println("O resultado da operação é: " + resultado);
        }

        scanner.close();
    }
}
