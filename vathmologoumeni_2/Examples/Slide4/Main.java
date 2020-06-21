package vathmologoumeni_2.Examples.Slide4;

//Slide 40 of 208, Example 4 of 32
//Nested classes

public class Main 
{
    //this is a nested class, it has all the same stuff as a normal class
    static class Player
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

        //also we can created a second nested class, which is also visible
        static class Human
        {
            String name;

            public Human(String name)
            {
                this.name = name;
            }

            public void introduceSelf()
            {
                System.out.println("Hello, my name is " + this.name + "!");
            }
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

        Player.Human h1 = new Player.Human("Yiannis");
        h1.introduceSelf();
    }
}