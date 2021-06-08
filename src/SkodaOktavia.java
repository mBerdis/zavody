public class SkodaOktavia implements Zavodnik
{
    private double palivoVNadrzi;
    private double spotrebaNaSto;

    public void pripravSa()
    {
        this.palivoVNadrzi = 120.0;
        this.spotrebaNaSto = 7.3;
    }

    public void splnJednoKoloZavodu(double kolkoKilometrov)
    {
        this.palivoVNadrzi  -= (kolkoKilometrov/100) * this.spotrebaNaSto;

        int chybovost = 8;

        if (Math.random() * 100 < chybovost)
        {
            System.err.println("SKODA SA POKAZILA");
        }
    }
}
