package entities;

public class Monomio implements Cloneable
{
    private double coeficiente, expoente;

    public double getCoeficiente ()
    {
        return this.coeficiente;
    }

    public double getExpoente ()
    {
        return this.expoente;
    }

    public void setCoeficiente (double coeficiente)
    {
        this.coeficiente=coeficiente;
    }

    public void setExpoente (double expoente)
    {
        this.expoente=expoente;
    }

    public Monomio (double coeficiente, double expoente)
    {
        this.coeficiente=coeficiente;
        this.expoente=expoente;
    }

    public Monomio mais (Monomio m) throws Exception
    {
        if (m==null) throw new Exception ("falta fornecer monomio");

        if (this.expoente!=m.expoente) throw new Exception ("expoentes diferentes");

        return new Monomio (this.coeficiente+m.coeficiente,this.expoente);
    }

    public Monomio menos (Monomio m) throws Exception
    {
        if (m==null) throw new Exception ("falta fornecer monomio");

        if (this.expoente!=m.expoente) throw new Exception ("expoentes diferentes");

        return new Monomio (this.coeficiente-m.coeficiente,this.expoente);
    }

    public Monomio vezes (Monomio m) throws Exception
    {
        if (m==null) throw new Exception ("falta fornecer monomio");

        return new Monomio (this.coeficiente*m.coeficiente,this.expoente+m.coeficiente);
    }

    public Monomio divididoPor (Monomio m) throws Exception
    {
        if (m==null) throw new Exception ("falta fornecer monomio");

        if (m.coeficiente==0) throw new Exception ("divisao por zero");

        return new Monomio (this.coeficiente/m.coeficiente,this.expoente-m.coeficiente);
    }

    public double aplicadoA (double x)
    {
        return this.coeficiente*Math.pow(x,this.expoente);
    }

    @Override
    public String toString ()
    {
        if (this.coeficiente==0) return "0";

        if (this.expoente==0) return ""+this.coeficiente;

        if (this.coeficiente==1 && this.expoente==1) return "x";

        if (this.coeficiente!=1 && this.expoente==1) return this.coeficiente+"x";

        if (this.coeficiente==1 && this.expoente!=1) return "x"+this.expoente;

        return this.coeficiente+"x"+this.expoente;
    }

    @Override
    public boolean equals (Object obj)
    {
        if (obj==this) return true;
        if (obj==null) return false;
        if (obj.getClass()!=this.getClass()) return false;

        Monomio m = (Monomio)obj;
        if (this.coeficiente!=m.coeficiente || this.expoente!=m.expoente) return false;

        return true;
    }

    @Override
    public int hashCode ()
    {
        int ret=1; // qualquer valor positivo serviria, usamos 1

        // qualquer numero primo serviria, usamos 13
        // ret=ret*13 + new Double (this.coeficiente).hashCode();
        // o comando acima será acusado de deprecated, fora de moda
        // o comando abaixo é o que está em moda agora
        ret=ret*13 + Double.valueOf(this.coeficiente).hashCode();

        // qualquer numero primo serviria, usamos 13, mas poderia ser outro primo,
        // mesmo tendo usado 13 acima
        // ret=ret*13 + new Double (this.expoente).hashCode();
        // o comando acima será acusado de deprecated, fora de moda
        // o comando abaixo é o que está em moda agora
        ret=ret*13 + Double.valueOf(this.expoente).hashCode();

        if (ret<0) ret=-ret;

        return ret;
    }

    // construtor de cópia; chamado assim porque tem como parametro
    // uma instância da própria classe
    public Monomio (Monomio modelo) throws Exception
    {
        if (modelo==null) throw new Exception ("modelo ausente");

        this.coeficiente = modelo.coeficiente;
        this.expoente    = modelo.expoente;
    }

    @Override
    public Object clone ()
    {
        Monomio ret=null;
        try
        {
            ret = new Monomio (this);
        }
        catch (Exception erro)
        {} // nunca deixe levianamente um catch vazio; só o faça tendo certeza de que o try que o precede não produzirá exceções; é o que ocorre aqui
        return ret;
    }
}