import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opt, amnt;
		double total = 0;
		
		System.out.println("=========== ARTHUR LANCHES ===========");
		System.out.println("1. Cachorro Quente			R$4.00");
		System.out.println("2. X-Salada				R$4.50");
		System.out.println("3. X-Bacon				R$5.00");
		System.out.println("4. Torrada Simples			R$2.00");
		System.out.println("5. Refrigerante				R$1.50");
		
		System.out.print("Insira o item que deseja: ");
		opt = sc.nextInt();
		System.out.print("Insira a quantidade: ");
		amnt = sc.nextInt();
		
		
		switch(opt) {
			case 1:
				total = (float) amnt * 4.00;
				break;
			case 2:
				total = (float) amnt * 4.50;
				break;
			case 3:
				total = (float) amnt * 5.00;
				break;
			case 4:
				total = (float) amnt * 2.00;
				break;
			case 5:
				total = (float) amnt * 1.50;
				break;
			default:
				System.out.println("Opção invalida!!");
		}
		
		System.out.printf("Total da compra:  R$ %.2f", total);
		
        sc.close();
	}
}




