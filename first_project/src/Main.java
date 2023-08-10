import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] range = {0, 0};
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			
			if (10 <= x && x <= 20) {
				range[0]++;
			} else {
				range[1]++;
			}
		}
		
		System.out.printf("%d in%n%d out", range[0], range[1]);
		
		
		sc.close();
	}
}