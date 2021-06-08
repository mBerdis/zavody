public class Jaguar
{
    private double palivoVNadrzi;
    private double spotreba;

    public Jaguar(double palivoVNadrzi)
    {
        this.palivoVNadrzi = 0;
        spotreba = 10;
    }

    public void pripravSa()
    {
        this.palivoVNadrzi = 100;
    }

    public void splnJednoKoloZavodu(double kolkoKilometrov)
    {
        this.palivoVNadrzi  -= (kolkoKilometrov/100) * this.spotreba;
    }

}
