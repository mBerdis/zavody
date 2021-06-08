public class PerpetuumMobile implements Zavodnik
{
    public void pripravSa()
    {

    }

    public boolean splnJednoKoloZavodu(double kolkoKilometrov)
    {
        int chybovost = 10;

        if (Math.random() * 100 < chybovost)
        {
            System.out.println("PERPETUUM SA POKAZIL");
            return false;
        }

        System.out.println("PERPETUUM > Kolo prejdene");
        return true;
    }
}
