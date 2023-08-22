
public class Time {
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
    public void setMinuto(byte minuto) throws Exception
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
    	if (segundos >= 0 && segundos < 60) {
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
        setMinuto(minuto);
        setSeconds(segundos);
    }
    
    
}
