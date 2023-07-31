import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String x;

        System.out.print("Insira um numero: ");

        x = sc.next();

        System.out.println("O número inserido é: " + x);

        sc.close();
    }
}
