package vathmologoumeni_2.Examples.Slide9.Classes;

//this class also extends Vehicle, all abstract methods have to be implemented, including the constructor
public class Airplane extends Vehicle
{
    private float z;      //since airplanes can fly, we add another coordinate, that only the airplane has

    public Airplane(String model)
    {
        super(model);
        this.z = 0;     //since everything has been done from the vehicle constructor, all that remains is to set to 0 the only coordinate only the Airplane has
    }

    //in this class we MUST implement all abstract methods
    public void move(float x, float y)
    {
        this.x += x;
        this.y += y;
    }

    //but we can also put additional ones, that only the Airplane class has
    public void fly(float x, float y, float z)
    {
        this.x += x;
        this.y += y;
        this.z += z;
    }

}
