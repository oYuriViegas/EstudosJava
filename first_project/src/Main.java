import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double delta, a, b, c, x1, x2;
        
        System.out.println("Insira o valor de \"A\": ");
        a = sc.nextDouble();
        System.out.println("Insira o valor de \"B\": ");
        b = sc.nextDouble();
        System.out.println("Insira o valor de \"C\": ");
        c = sc.nextDouble();

        delta = Math.pow(b, 2.0) -4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        
        System.out.printf("x1: %f%n", x1);
        System.out.printf("x2: %f", x2);
        
        sc.close();
    }
}
