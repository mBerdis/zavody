public class Zavody
{
    private Jaguar jaguar = new Jaguar();
    private SkodaOktavia skoda = new SkodaOktavia();
    private PerpetuumMobile perpetuum = new PerpetuumMobile();

    boolean zavodnik1MozeIstDalej;
    boolean zavodnik2MozeIstDalej;
    boolean zavodnik3MozeIstDalej;


    public void usporiadajZavody(Zavodnik zavodnik1, Zavodnik zavodnik2, Zavodnik zavodnik3)
    {
        zavodnik1.pripravSa();
        zavodnik2.pripravSa();
        zavodnik3.pripravSa();



    }
}
