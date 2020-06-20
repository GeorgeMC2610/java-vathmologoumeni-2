package vathmologoumeni_2.Examples.Slide12;

public class Video 
{
    public static String[] formats = {".mp4", ".mov", ".flv", ".mkv"};
    private int durationInSecs;
    private String title;

    public Video(int durationInSecs, String title)
    {
        this.durationInSecs = durationInSecs;
        this.title = title;
    }

    public void playVideo(int format)
    {
        System.out.println("Now playing " + this.title + formats[format] + " (" + this.durationInSecs + " seconds)");
    }

    public static void showAvailableFormats()
    {
        System.out.println("Currently there are " + formats.length + " available video formats: ");
        for (int i = 0; i < formats.length; i++)
        {
            System.out.println(i+1 + ". " + formats[i]);
        }
    }

}