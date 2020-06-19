package vathmologoumeni_2.Examples.Slide27.Classes;

public class Player extends NPC
{
    //we call the NPC constructor
    public Player(String name)
    {
        super(name);
    }

    //and now we can edit any method that isn't set as 'final' from the super class
    @Override
    public void saySomething(String something)
    {
        System.out.println("As a player, I have to say: " + something);
    }

    @Override
    public void describeSelf()
    {
        System.out.println("I am a Player, my name is " + this.name + ", I am at " + this.x + ", " + this.y + " and I have " + this.health + " health points");
    }
}