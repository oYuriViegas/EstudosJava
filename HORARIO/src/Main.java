import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		byte hora = -1;
		byte minuto = -1;
		byte segundo = -1;
		
		Time currentTime = null;
		
		// Lendo e validando a hora
		while (true)
		{
			try
            {
                System.out.print("Insira a hora (0-23): ");
                hora = sc.nextByte();
                
                // Setter para fazer a validação
                currentTime = new Time((byte)0, (byte)0, (byte)0); // Instância temporária só para validação
                currentTime.setHour(hora);
                
                break; // Se chegar aqui, a entrada é válida
            }
            catch (InputMismatchException ime)
            {
                System.out.println("Por favor, insira um número válido.");
                sc.nextLine(); // Limpa o buffer
            }
            catch (Exception error)
            {
                System.err.println(error.getMessage());
            }
		}
		
		// Lendo e validando o minuto
		while (true)
		{
			try
			{
				System.out.print("Insira o minuto (0-59): ");
				minuto = sc.nextByte();
				
				currentTime.setMinute(minuto);
				
				break;
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Por favor, insira um número válido");
				sc.nextLine();
			}
			catch (Exception error)
			{
				System.err.println(error.getMessage());
			}
		}
		
		// Lendo e validando o segundo
		while (true)
		{
			try
			{
				System.out.print("Insira os segundos (0-59): ");
				segundo = sc.nextByte();
				
				currentTime.setSeconds(segundo);
				
				break;
			}
			catch (InputMismatchException ime)
			{
				System.out.println("Por favor, insira um número válido");
				sc.nextLine();
			}
			catch (Exception error)
			{
				System.err.println(error.getMessage());
			}
		}
		
		try
		{
			currentTime = new Time(hora, minuto, segundo);
			System.out.println(currentTime);
		}
		catch (Exception error)
		{
			System.err.println(error.getMessage());
		}
		
		sc.close();
	}
}



