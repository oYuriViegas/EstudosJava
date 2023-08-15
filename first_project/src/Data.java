public class Data
{
    private byte  dia, mes;
    private short ano;

    private boolean isBissexto (short ano)
    {
        // Calendario Juliano
        if (ano<1582)
            if (ano%4==0)
                return true;
            else
                return false;

        // Calendario Gregoriano
        if (ano%400==0) return true;
        if (ano%  4==0 && ano%100!=0) return true;
        return false;
    }

    private boolean isValida (byte dia, byte mes, short ano)
    {
        if (ano<-45) return false; // antes do Calendario Juliano
        if (ano== 0) return false; // nao existiu ano 0; do ano 1ac foi direto para o ano 1dc
        if (ano==1582 && mes==10 && dia>=5 && dia<=14) return false; // dias cortados dos calendario pelo Papa Gregorio

        if (dia<1 || dia>31 || mes<1 || mes>12) return false;

        if (dia>30 && (mes==4 || mes==6 || mes==9 || mes==11)) return false;
        if (dia>29 && mes==2) return false;
        if (dia>28 && mes==2 && !isBissexto(ano)) return false;

        return true;
    }

    public Data (byte dia, byte mes, short ano) throws Exception
    {
        if (!isValida(dia,mes,ano))
            throw new Exception ("data invalida");

        this.dia=dia;
        this.mes=mes;
        this.ano=ano;
    }

    public void setDia (byte dia) throws Exception
    {
        if (!isValida(dia,this.mes,this.ano))
            throw new Exception ("dia invalido");

        this.dia=dia;
    }

    public void setMes (byte mes) throws Exception
    {
        if (!isValida(this.dia,mes,this.ano))
            throw new Exception ("mes invalido");

        this.mes=mes;
    }

    public void setAno (short ano) throws Exception
    {
        if (!isValida(this.dia,this.mes,ano))
            throw new Exception ("data invalida");

        this.ano=ano;
    }

    public byte getDia ()
    {
        return this.dia;
    }

    public byte getMes ()
    {
        return this.mes;
    }

    public short getAno ()
    {
        return this.ano;
    }
}
