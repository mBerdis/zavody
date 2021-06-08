public class SkodaOktavia implements Zavodnik
{
    private double palivoVNadrzi;
    private double spotrebaNaSto;

    public void pripravSa()
    {
        this.palivoVNadrzi = 120.0;
        this.spotrebaNaSto = 7.3;
    }

    public boolean splnJednoKoloZavodu(double kolkoKilometrov)
    {
        this.palivoVNadrzi  -= (kolkoKilometrov/100) * this.spotrebaNaSto;

        int chybovost = 6;

        if (Math.random() * 100 < chybovost)
        {
            System.out.println("SKODA SA POKAZILA");
            return false;
        }

        System.out.println("SKODA > Kolo prejdene");
        return true;
    }
}
