package vathmologoumeni_2.Examples.Slide9.Classes;

//this class is abstract, we cannot make an object out of it. Later it's going to be extended by another class, which we will make an object out of it.
public abstract class Vehicle
{
    protected float x, y;
    protected String model;

    //this is a general constructor, which means that every class extending this one, will have set the model variable before getting instanciated
    public Vehicle(String model)
    {
        this.model = model;
        this.x = 0;
        this.y = 0;
    }

    //this method is abstract, which means that we have to implement it in all the classes that extend Vehicle. For now we just declare it
    public abstract void move(float x, float y);

    //this method though is NOT abstract, which means we have to build the body here. but any class that extends vehicle may use it.
    public void announceModel()
    {
        System.out.println("My model name is: " + this.model);
    }
}
