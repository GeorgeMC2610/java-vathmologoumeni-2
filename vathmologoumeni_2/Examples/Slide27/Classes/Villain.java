package vathmologoumeni_2.Examples.Slide27.Classes;

public class Villain extends NPC
{
    //special treatment for Villains
    public Villain(String name)
    {
        super(name);
        this.health = 150;
    }

    //Villains can also override methods from the NPC class as it extends it
    @Override
    public void saySomething(String something)
    {
        System.out.println("You think you can beat me? I'm a Villain, I have to say: " + something);
    } 

    @Override
    public void describeSelf()
    {
        System.out.println("I'm an evil Villain. My name is " + this.name + ", I'm currently at " + this.x + ", " + this.y + " and I have " + this.health + " health points.");
    }
}