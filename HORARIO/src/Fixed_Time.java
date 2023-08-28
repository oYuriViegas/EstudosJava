
public class Time 
{
	private byte hour;
	private byte minute;
	private byte seconds;
	
	
	// Getter para hora
	public byte getHour()
	{
		return hour;
	}
	
	// Setter para hora
    public void setHour(byte hora) throws Exception
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
    public byte getMinute()
    {
        return minute;
    }

    // Setter para minuto
    public void setMinute(byte minuto) throws Exception
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
    public byte getSeconds()
    {
    	return seconds;
    }
    
    
    // Setter para segundos
    public void setSeconds(byte segundos) throws Exception
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
    public Time(byte hora, byte minuto, byte segundos) throws Exception
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
    	seconds += amtSec;
    	
    	//Verificar se a quantidade de segundos excedeu 60, 
    	//incrementar os minutos e ajustar os segundos
    	while (seconds >= 60) 
    	{
    		minute++;
    		seconds -= 60;
    	}
    	
    	// Verificar se os minutos excederam 60, 
    	// incrementar as horas e ajustar os minutos
    	// Adjusting minutes and hours
    	hour += minute / 60;
    	minute = minute % 60;
    	
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
    	
    	seconds -= amtSec;
    	
    	while (seconds <= 0)
    	{
    		minute --;
    		seconds += 60;
    	}
    	
    	// Adjusting minutes and hours when rewinding
    	hour += minute / 60;  // This will subtract from hour if minute is negative
    	minute = minute % 60;
    	
    	while (hour <= 24)
    	{
    		hour += 24;
    	}
    	
    	
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









