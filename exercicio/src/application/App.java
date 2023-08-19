package application;

import java.util.Scanner;

import entities.Retangle;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.print("Enter retangle height: ");
		retangle.height = sc.nextDouble();
		
		System.out.print("Enter retangle width: ");
		retangle.width = sc.nextDouble();
		
		System.out.printf("Retangle area: %.2f%n", retangle.area());
		System.out.printf("Retangle perimeter: %.2f%n", retangle.perimeter());
		System.out.printf("Retangle diagonal: %.2f%n", retangle.diagonal());
		
		sc.close();
	}
}
