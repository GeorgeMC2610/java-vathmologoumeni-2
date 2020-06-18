package vathmologoumeni_2.Examples.Slide10;
import vathmologoumeni_2.Examples.Slide10.Classes.*;

//Slide 85 of 208, Example 10 of 32
//Final classes, methods and variables

public class Main 
{
    public static void main(String[] args) 
    {
        //here we instanciate the class
        Unipi pliroforiki = new Unipi("Department of Informatics", 1000);

        //we can use the final method from the University class
        pliroforiki.makeAnnouncement("This is the " + pliroforiki.name + " speaking.");

        //and even though the name and address variables are public, they're declared as final; they can only be read, not modified.
        System.out.println("I can see " + Unipi.name + "' name and addres, but there's no way I can change either of those.");
    }
}