package vathmologoumeni_2.Examples.Slide1;

//Slide 5 of 208, example 1 out of 32.
//Class vs Object

//the following line is the program's main class, so we don't want to instantiate an object from the Main class. But here we're going to create objects from the Player class. 
public class Main
{
    public static void main(String[] args) 
    {
        Player p1 = new Player();               //we just created a Player variable with no set attributes yet.
        p1.move(4, 6);                          //using the 'move' method we just moved the player.
        p1.showCoords();                        //we can output the coordinates from the showCoords method.
    
        Player p2 = new Player();               //now we just created a new player, with brand new attributes.
        p2.move(9, 2);                          //this new player, is now in a different place.
        p2.showCoords();

        p1.move(6, 4);
        p2.move(1, 8);                          //now the two players are in the same x and y coordinates (10, 10), but they are still different.

        p1.showCoords();
        p2.showCoords();
    }
}