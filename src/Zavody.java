public class Zavody
{
    private Jaguar jaguar = new Jaguar();
    private SkodaOktavia skoda = new SkodaOktavia();
    private PerpetuumMobile perpetuum = new PerpetuumMobile();

    boolean zavodnik1MozeIstDalej;
    boolean zavodnik2MozeIstDalej;
    boolean zavodnik3MozeIstDalej;


    public void usporiadajZavody()
    {
        pripravit();
        double dlzkaKola = 15;

        while (zavodnik1MozeIstDalej || zavodnik2MozeIstDalej || zavodnik3MozeIstDalej)
        {
            if (zavodnik1MozeIstDalej) zavodnik1MozeIstDalej = jaguar.splnJednoKoloZavodu(dlzkaKola);
            if (zavodnik2MozeIstDalej) zavodnik2MozeIstDalej = skoda.splnJednoKoloZavodu(dlzkaKola);
            if (zavodnik3MozeIstDalej) zavodnik3MozeIstDalej = perpetuum.splnJednoKoloZavodu(dlzkaKola);
        }

    }

    public void pripravit()
    {
        jaguar.pripravSa();
        skoda.pripravSa();
        perpetuum.pripravSa();

        zavodnik1MozeIstDalej = true;
        zavodnik2MozeIstDalej = true;
        zavodnik3MozeIstDalej = true;
    }

}
