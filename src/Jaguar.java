public class Jaguar implements Zavodnik
{
    private double palivoVNadrzi;
    private double spotrebaNaSto;

    public void pripravSa()
    {
        this.palivoVNadrzi = 150.0;
        this.spotrebaNaSto = 7.3;
    }

    public boolean splnJednoKoloZavodu(double kolkoKilometrov)
    {
        this.palivoVNadrzi  -= (kolkoKilometrov/100) * this.spotrebaNaSto;

        int chybovost = 5;

        if (Math.random() * 100 < chybovost)
        {
            System.out.println("JAGUAR SA POKAZIL");
            return false;
        }

        System.out.println("JAGUAR > Kolo prejdene");
        return true;
    }

}
