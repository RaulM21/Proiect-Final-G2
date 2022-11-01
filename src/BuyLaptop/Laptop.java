package BuyLaptop;
public class Laptop //Aceasta clasa contine datele despre laptop-uri, respectiv are metodele de get/set
{
    private String processor;
    private String video_card;
    private int ram;

    public Laptop(String processor, String video_card, int ram) //Constructor
    {
        this.processor = processor;
        this.video_card = video_card;
        this.ram = ram;
    }

    public Laptop(String processor, int ram) //Constructor 2
    {
        this.processor = processor;
        this.ram = ram;
    }

    public void setProcessor(String processor) //Metodele Setter
    {
        this.processor = processor;
    }
    public void setVideoCard(String video_card)
    {
        this.video_card = video_card;
    }
    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public String getProcessor()  //Metodele Getter
    {
        return processor;
    }
    public String getVideoCard()
    {
        return video_card;
    }
    public int getRam()
    {
        return ram;
    }

    public String toString()  //Metoda toString
    {
        return "You would like a laptop with : " + this.processor + ", " + this.video_card + " and " + this.ram + "GB RAM.";
    }

    public String StringBuffer() //Metoda StringBuffer
    {
        StringBuffer str = new StringBuffer();
        str.append("A fost adaugat urm. laptop : ");
        str.append(this.processor);
        str.append(", ");
        str.append(this.video_card);
        str.append(" and ");
        str.append(this.ram);
        str.append("GB RAM");
        return str.toString();
    }
}

