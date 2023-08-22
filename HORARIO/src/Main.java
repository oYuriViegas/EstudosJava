public class Main
{
    public static void main (String[] args)
    {
        try
        {
            Horario agora = new Horario ((byte)8,(byte)23,(byte)30);
            System.out.println (agora);
            agora.avance((short)500/*segundos*/);
            System.out.println (agora);
            agora.retroceda((short)1500/*segundos*/);
            System.out.println (agora);
        }
        catch (Exception erro)
        {
            System.err.println (erro.getMessage());
        }
    }
}