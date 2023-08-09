// Programa que lê senha válida.
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int pw = 2506;
		int resp = 0;

		while(resp != pw){
			System.out.print("Insira a senha do sistema: ");
			resp = sc.nextInt();

			String result = (resp == pw) ? "Acesso liberado!!": "Acesso Negado!!";

			System.out.println(result);

			/* if(resp == pw){
				System.out.println("Acesso liberado!!");
			} else {
				System.out.println("Acesso negado!!");
			} */
		}

		sc.close();
	}
}