package vathmologoumeni_2.Examples.Slide27.Classes;

//here we have an abstract class that will be eventually extended
public abstract class NPC
{
    protected int health;
    protected String name;
    protected float x, y;

    //the constructor(s) cannot be overriden
    public NPC(String name)
    {
        this. health = 100;
        this.x = this.y = 0f;
        this.name = name;   
    }

    //neither does this method can be overriden. it's set as 'final'
    public final void move(float x, float y)
    {
        this.x += x;
        this.y += y;
    }

    //but this method can be overriden
    public void saySomething(String something)
    {
        System.out.println("[" + this.name + "]: " + something);   
    }

    //this one MUST be overriden, since it's abstract it must be implemented in a sub-class
    public abstract void describeSelf();
}