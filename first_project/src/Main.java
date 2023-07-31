import java.util.Scanner;
import java.util.Locale;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String x;
        int y;
        double z;
        char c;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        c = sc.next().charAt(0);

        System.out.println("Dados Digitados:");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(c);

        sc.close();
    }
}