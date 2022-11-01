package BuyLaptop;

public class Clienti
{
    protected String nume;
    protected String prenume;
    protected String email;

    public Clienti(String nume, String prenume, String email)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
    }

    public void setNume(String nume) //Metodele Setter
    {
        this.nume = nume;
    }
    public void setPrenume(String prenume)
    {
        this.prenume = prenume;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNume()  //Metodele Getter
    {
        return nume;
    }
    public String getPrenume()
    {
        return prenume;
    }
    public String getEmail()
    {
        return email;
    }
}
