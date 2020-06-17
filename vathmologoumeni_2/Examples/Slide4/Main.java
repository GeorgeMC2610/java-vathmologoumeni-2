package vathmologoumeni_2.Examples.Slide4;
//Slide 40 of 208, Example 4 of 32
//Nested classes

public class Main 
{
    private class Test
    {
        public int addTwoNumbers(int a, int b)
        {
            return a+b;
        }
    }

    private static class Player
    {
        private int x, y;

        public void move(int x, int y)
        {
            this.x += x;
            this.y += y;
        }

        public void announceCoordinates()
        {
            System.out.println(this.x + ", " + this.y);
        }
    }



    public static void main(String[] args)
    {
        Player p1 = new Player();
        p1.move(5, 5);
        p1.announceCoordinates();

        Player p2 = new Player();
        p2.move(10, 10);
        p2.announceCoordinates();
    }
}