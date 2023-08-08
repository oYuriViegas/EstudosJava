import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double delta, a, b, c, x1, x2;

        a = 1.0;
        b = -3.0;
        c = -54.0;

        delta = Math.pow(b, 2.0) -4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        
        System.out.println(x1);
        System.out.println(x2);
        
        sc.close();
    }
}
