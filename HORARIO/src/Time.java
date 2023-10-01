
public class Time 
{
	private int hour;
	private int minute;
	private int seconds;
	
	
	// Getter para hora
	public int getHour()
	{
		return hour;
	}
	
	// Setter para hora
    public void setHour(int hora) throws Exception
    {
        if (hora >= 0 && hora < 24)
        {
            this.hour = hora;
        }
        else
        {
            throw new Exception("Hora inválida");
        }
    }
    
    // Getter para minuto
    public int getMinute()
    {
        return minute;
    }

    // Setter para minuto
    public void setMinute(int minuto) throws Exception
    {
        if (minuto >= 0 && minuto < 60)
        {
            this.minute = minuto;
        }
        else
        {
            throw new Exception("Minuto inválido");
        }
    }
	// Getter para segundos
    public int getSeconds()
    {
    	return seconds;
    }
    
    
    // Setter para segundos
    public void setSeconds(int segundos) throws Exception
    {
    	if (segundos >= 0 && segundos < 60) 
    	{
    		this.seconds = segundos;
    	}
    	else
    	{
    		throw new Exception("Segundos inválidos");
    	}
    }
    
    // Construtor
    public Time(int hora, int minuto, int segundos) throws Exception
    {
        setHour(hora);
        setMinute(minuto);
        setSeconds(segundos);
    }
    
    // Avançar o tempo
    public void advanceTime(int amtSec) throws Exception
    {
    	if (amtSec <= 0)
    	{
    		throw new Exception("Quantidade de segundos inválida");
    	}
    	
    	// Adiciona segundo ao horário atual
    	int auxSecond = seconds;
    	
    	auxSecond += amtSec;
    	
    	//Verificar se a quantidade de segundos excedeu 60, 
    	//incrementar os minutos e ajustar os segundos
    	while (auxSecond >= 60) 
    	{
    		minute++;
    		auxSecond -= 60;
    	}
    	
    	seconds = (int) auxSecond;
    	
    	// Verificar se os minutos excederam 60, 
    	// incrementar as horas e ajustar os minutos
    	while (minute >= 60)
    	{
    		hour ++;
    		minute -= 60;
    	}
    	
    	// Se a hora exceder 24, ajustar para voltar ao formato de 24 horas
    	while (hour >= 24)
    	{
    		hour -= 24;
    	}
    	
    }
    
    public void rewindTime(int amtSec) throws Exception
    {
    	if (amtSec <= 0)
    	{
    		throw new Exception("Quantidade de segundos inválida");
    	}
    	
    	// Retroceder segundo ao horário atual
    	
    	int auxSeconds = seconds;
    	
    	auxSeconds -= amtSec;
    	
    	while (auxSeconds < 0)
    	{
    		minute --;
    		auxSeconds += 60;
    	}
    	
    	seconds = (int) auxSeconds;
    	
    	while (minute<= 0) 
    	{
    		hour -= (hour == 0) ? 0 : 23;
    		minute += (hour == 0) ? 0 : 60;
    	}
    	
//    	while (hour <= 24)
//    	{
//    		hour += (hour == 0) ? 0 : 24;
//    	}
    	
    	
    }
    
    public String toString()
    {
    	return "Hora Atual: "
    			+ getHour() 
    			+":" 
    			+ getMinute() 
    			+ ":" 
    			+ getSeconds();
    }

}









