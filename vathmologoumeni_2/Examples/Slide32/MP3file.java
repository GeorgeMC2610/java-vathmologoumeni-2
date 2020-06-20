package vathmologoumeni_2.Examples.Slide32;

public class MP3file 
{
    //only this variable will be visible to the methods in anonymous objects
    final int maxKbps = 320;

    //all these variables will be hidden.
    private int Kbps;
    private float sizeInMB;
    private String fileName;
    
    public MP3file(int Kpbs, float sizeInMB, String fileName) 
    {
        this.sizeInMB = sizeInMB;
        this.fileName = fileName;
        this.Kbps = Kpbs;
    }

    void play()
    {
        System.out.println("Now playing: " + this.fileName);
    }

    static void play(MP3file a)
    {
        System.out.println("Now playing: " + a.fileName);
    }
}