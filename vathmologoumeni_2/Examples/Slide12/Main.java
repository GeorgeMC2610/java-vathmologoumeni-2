package vathmologoumeni_2.Examples.Slide12;

//Slide 88 of 208, Example 12 of 32
//Static & Non-static access

public class Main
{
    public static void main(String[] args)
    {
        //we must create an object to get access to non-static variables and methods
        Video v1 = new Video(147, "Java_Tutorial_1");

        //we can play a video because we've created a Video object. Every video object has access to the 'playVideo' method.
        v1.playVideo(0);

        //but also has access to static variables and methods. It's just not how these variables/methods should be accessed.
        v1.showAvailableFormats();
        System.out.println("I'm accessing a static variable, through an instance: " + v1.formats[0]);

        //static methods and variables don't need an object to be accessed.
        System.out.println("I can access the video formats with no objects. Look! " + Video.formats[0] + ", " + Video.formats[1] + "! That's because these belong in the class.");
        Video.showAvailableFormats();

        //although we can't access playVideo()
        System.out.println("Although only instances can access 'playVideo()', because this method is not static, therefore it does not belong in the class.");
    }
}