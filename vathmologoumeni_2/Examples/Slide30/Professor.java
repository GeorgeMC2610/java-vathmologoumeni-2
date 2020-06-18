package vathmologoumeni_2.Examples.Slide30;

public class Professor
{
    private String name;

    public Professor(String name)
    {
        this.name = name;
    }

    public void makeAnnouncement(String announcement)
    {
        System.out.println("IMPORTANT ANNOUNCEMENT: " + announcement);
    }

    public String getName()
    {
        return this.name;
    }
}