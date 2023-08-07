import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int firstNumber, secondNumber, option;
        float result;

        option = 12345;

        while(option != 0){
            System.out.print("Insira um numero: ");
            firstNumber = sc.nextInt();

            System.out.print("Insira outro número: ");
            secondNumber = sc.nextInt();

            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");

            option = sc.nextInt();

            switch(option){
                case 1:
                    result = (float) firstNumber + secondNumber;
                    System.out.printf("A soma de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 2:
                    result = (float) firstNumber - secondNumber;
                    System.out.printf("A subtração de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 3:
                    result = (float) firstNumber * secondNumber;
                    System.out.printf("A multiplicação de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
                    break;
                case 4:
                    result = (float) firstNumber / secondNumber;
                    System.out.printf("A divisão de %d por %d é: %.2f%n", firstNumber, secondNumber, result);    
                    break;
                default:
                    continue;                
            }

            /* if (option == 1){
                result = (float) firstNumber + secondNumber;
                System.out.printf("A soma de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
            } else if(option == 2){
                result = (float) firstNumber - secondNumber;
                System.out.printf("A subtração de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
            } else if(option == 3){
                result = (float) firstNumber * secondNumber;
                System.out.printf("A multiplicação de %d e %d é: %.2f%n", firstNumber, secondNumber, result);
            } else if(option == 4){
                result = (float) firstNumber / secondNumber;
                System.out.printf("A divisão de %d por %d é: %.2f%n", firstNumber, secondNumber, result);
            } */
        }

        sc.close();
    }
}
