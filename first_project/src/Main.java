public class Main
{
    public static void main (String[] args)
    {
        try{
            Data descobrimento = new Data ((byte)22,(byte)4,(short)1500);
            Data tiradentes    = new Data ((byte)21,(byte)4,(short)1792);
            Data independencia = new Data ((byte)7,(byte)9,(short)1822);
            
            System.out.println("Descobrimento: " + descobrimento.getDia() + "/" + descobrimento.getMes() + "/" + descobrimento.getAno());
            System.out.println("Tiradentes: " + tiradentes.getDia() + "/" + tiradentes.getMes() + "/" + tiradentes.getAno());
            System.out.println("Independencia: " + independencia.getDia() + "/" + independencia.getMes() + "/" + independencia.getAno());
        } 
        catch(Exception error)
        {
            System.out.println(error.getMessage());
        } 
    }
}
