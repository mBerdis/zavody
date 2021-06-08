public class PerpetuumMobile implements Zavodnik
{
    public void pripravSa()
    {

    }

    public void splnJednoKoloZavodu(double kolkoKilometrov)
    {
        int chybovost = 30;

        if (Math.random() * 100 < chybovost)
        {
            System.err.println("PERPETUUM SA POKAZIL");
        }
    }
}
