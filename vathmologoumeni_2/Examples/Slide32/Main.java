package vathmologoumeni_2.Examples.Slide32;

//Slide 201 of 208, Example 32 of 32
//Anonymous class variables

public class Main 
{
    public static void main(String[] args) 
    {
        MP3file a1 = new MP3file(320, 23.5f, "Pendulum - Watercolour");

        //this anonymous object doesn't have access to any non-static variables, since it immideately extends the class
        new MP3file(320, 7.33f, "Colbreakz - 2011")
        {
            
            @Override
            public void play()
            {
                System.out.println("This method has only access to final or static variables, like maxKbps: " + this.maxKbps);
                System.out.println("Therefore, this method doesn't have access to all variables that MP3file has.");
            }
        }.play();

        a1.play();
    }
}