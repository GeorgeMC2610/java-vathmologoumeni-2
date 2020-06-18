package vathmologoumeni_2.Examples.Slide31;

//Slide 191 of 208, Example 31 of 32
//Implementing an existing interface

//this is an interface that needs to be implemented with the following methods
interface Player
{
    public void move(int x, int y);
    public void announceCoordinates();
}

public class Main 
{
    public static void main(String[] args) 
    {
        //we can make an instance out of it, and immideately implement it
        Player p1 = new Player()
        {
            private int x = 0;      //we have to declare the variables that exist in the method's parameters
            private int y = 0;

            //but all the methods shown above must be implemented.
            @Override
            public void move(int x, int y)
            {
                this.x += x;
                this.y += y;
            }

            @Override
            public void announceCoordinates() 
            {
                System.out.println("I'm a player. Currently at: " + this.x + ", " + this.y);
            }

            //this means we cannot add additional methods. any other method must be declared in the top level interface.
        }; 
         
        p1.move(4, 5);
        p1.announceCoordinates();
    }

}
