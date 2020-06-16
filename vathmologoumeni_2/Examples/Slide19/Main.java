//Slide 111 of 208, Example 19 of 32
//Constructors

public class Main
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Player 1");
        p1.move(4f, 3f);

        //this player used the move method to get in these coordinates
        p1.announceCoordinates();

        Player p2 = new Player("Player 2", 4f, 3f);

        //but this one, was already there
        p2.announceCoordinates();

        //Player p3 = new Player();            //this one throws an exception, because there is not a constructor with zero parameters
    }
}