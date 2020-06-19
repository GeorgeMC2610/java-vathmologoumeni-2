package vathmologoumeni_2.Examples.Slide27;
import vathmologoumeni_2.Examples.Slide27.Classes.*;

//Slide 173 of 208, Example 27 of 32
//Method Overriding

public class Main 
{
    public static void main(String[] args) 
    {
        Player p1 = new Player("George");
        Villain v1 = new Villain("Bowser");

        //this method is final, so whatever object calls it, it does the same thing
        p1.move(4f, 5f);
        v1.move(6f, 4f);

        //this is overriden, so although they have the same method name, it does different things on different objects.
        p1.saySomething("Villains cannot beat me.");
        v1.saySomething("No one beats me!");

        //same thing with this one
        p1.describeSelf();
        v1.describeSelf();
    }
}