package vathmologoumeni_2.Examples.Slide9.Classes;

//this class extends vehicle, it already has all the attributes that we need. all we have to do is to implement all the abstract methods
public class Car extends Vehicle
{
    //this constructor is going to call the Vehicle constructor using super()
    public Car(String model)
    {
        super(model);
    }

    //in the Vehicle class, we must implement the move() method, or else it won't compile
    public void move(float x, float y)
    {
        this.x += x;
        this.y += y;
    }
}