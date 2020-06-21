package vathmologoumeni_2.Examples.Slide4;

public class Main2 
{
    public static void main(String[] args)
    {
        //in order to access a nested class through another class we must do it this way:
        Main.Player p1 = new Main.Player();
        p1.move(5, 6);
        p1.announceCoordinates();

        //and in order to access the nested-nested class, we can do this using the same way:
        Main.Player.Human h1 = new Main.Player.Human("George");
        h1.introduceSelf();
    }    
}