package BuyLaptop;

public class Reclamatii extends Clienti
{
    public Reclamatii(String nume, String prenume, String email)
    {
        super(nume, prenume, email);
    }

    public String afisareNumeClient()
    {
        return (super.nume + " " + super.prenume);
    }

    public String afisareEmailClient()
    {
        return (super.email);
    }
}
