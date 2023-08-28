import java.util.Scanner;
import java.util.InputMismatchException;

public class TimeMenu {
	
	private Time time;
	private Scanner scanner;
	
	public TimeMenu(Time time) {
		this.time = time;
		this.scanner = new Scanner(System.in);
	}
	
	
	public void displayMenu()
	{
		while (true)
		{
			System.out.println(time);
			System.out.println("1. Avançar tempo");
			System.out.println("2. Retroceder o tempo");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");
			
			int choice = getInput();
			
			switch (choice) {
				case 1:
					advanceTime();
					break;
				case 2:
					rewindTime();
					break;
				case 0:
					System.out.println("Saindo...");
					return;
				default:
					System.out.println("Opção inválida.");
			}
			
		}
	}
	
	private int getInput()
	{
		try
		{
			return scanner.nextInt();
		}
		catch (InputMismatchException ime)
		{
			System.out.println("Por favor, insira um número valido. ");
			scanner.nextLine(); // Limpar o buffer
			return -1;
		}
	}
	
	
	private void advanceTime()
	{
		System.out.print("Quantos segundos você deseja avançar?");
		int seconds = getInput();
		
		if (seconds < 0)
		{
			System.out.println("Número inválido.");
			return;
		}
		
		try
		{
			time.advanceTime(seconds);
		}
		catch (Exception error)
		{
			System.err.println(error.getMessage());
		}
	}
	
	private void rewindTime()
	{
		System.out.print("Quantos segundos você deseja retroceder?");
		int seconds = getInput();
		
		if (seconds < 0)
		{
			System.out.println("Número inválido.");
			return;
		}
		
		try
		{
			time.rewindTime(seconds);
		}
		catch (Exception error)
		{
			System.err.println(error.getMessage());
		}
	}
	
}
