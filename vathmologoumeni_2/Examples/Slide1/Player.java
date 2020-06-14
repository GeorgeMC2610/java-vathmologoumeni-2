//Slide 5 out of 208, example 1 out of 32.
//Class vs Object

//the following line reperesents a CLASS DECLARATION. This class has all the data that every player has.
public class Player
{
    private float x, y;         //every player will have x, y coordinates.

    public void move(int x, int y)      //every player is able to move in whatever direction.
    {
        this.x += x;
        this.y += y;
    }

    public void showCoords()            //also, every player will be able to show their coordinates on the console.
    {
        System.out.println(this.x + ", " + this.y);
    }
}