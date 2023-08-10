import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INICIO DO PROGRAMA");
		System.out.println("Insira um valor entre 1 e 1000: ");
		
		int userNum = sc.nextInt();
		
		for(int i = 1; i <= userNum; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		
		System.out.println("Numero do usuario: " + userNum);
		
		
		
		
		
		sc.close();
	}
}