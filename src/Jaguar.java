public class Jaguar implements Zavodnik
{
    private double palivoVNadrzi;
    private double spotrebaNaSto;

    public void pripravSa()
    {
        this.palivoVNadrzi = 150.0;
        this.spotrebaNaSto = 7.3;
    }

    public void splnJednoKoloZavodu(double kolkoKilometrov)
    {
        this.palivoVNadrzi  -= (kolkoKilometrov/100) * this.spotrebaNaSto;

        int chybovost = 12;

        if (Math.random() * 100 < chybovost)
        {
            System.err.println("JAGUAR SA POKAZIL");
        }
    }

}
