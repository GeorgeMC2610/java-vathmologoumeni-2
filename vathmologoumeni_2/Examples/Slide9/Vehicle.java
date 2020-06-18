package vathmologoumeni_2.Examples.Slide9;

//this class is an abstract class, we cannot make an object out of it. Later it's going to be extended by another class, which we will make an object out of it.
public abstract class Vehicle
{
    private float x, y;
    private String model;

    //this is a general constructor, which means that every class extending this one, will have set the model variable before getting instanciated
    public Vehicle(String model)
    {
        this.model = model;
    }
}
