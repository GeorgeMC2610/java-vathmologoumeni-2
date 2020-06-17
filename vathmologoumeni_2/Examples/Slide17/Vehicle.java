package vathmologoumeni_2.Examples.Slide17;

public abstract class Vehicle
{
    //these are the instance variables and since they're private, we'll need a way to set them
    private float x, y;

    public static final String manufacturer = "Unipi"; //keep your eye to this variable

    //this is the main constructor (super)
    public Vehicle()
    {
        this.x = this.y = 0f;
    }

    public void move(float x, float y)
    {
        this.x += x;        //this is going to set the instance's x and y (left from the equals sign) equal with the parameters' x and y (right from the equals)
        this.y += y;
    }

    public void announceCoordinates()
    {
        System.out.println("Currently at: " + this.x + ", " + this.y);      //again, this only affects the instance
    }
}

class Car extends Vehicle
{
    public static final String manufacturer = "CsUnipiCar";  //this is the same name as the vehicle class
    private int passengers;

    public Car()
    {
        super(); //this is calling the Vehicle constructor. this way, we can clone the vehicle class constructor to the extended class constructor
        this.passengers = 0;
    }

    public void setPassengers(int passengers)
    {
        if (passengers > 0 && passengers < 8)
            this.passengers = passengers;         //this is setting the instance's passengers (it must be a car) equal with the parameter's
    }

    public String getManufacturer()
    {
        String model = super.manufacturer + ", " + this.manufacturer;   //the super manufacturer is "Unipi" from the Vehicle class and this manufacturer is "CsUnipiCar"
        return model;
    }
}

class Bus extends Vehicle
{
    public static final String manufacturer = "UnipiBus";   //this is also the same name as the vehicle class
    private int standingPassengers, sittingPassengers;

    public Bus()
    {
        super(); //we're once again calling the vehicle constructor
        this.standingPassengers = this.sittingPassengers = 0;
    }

    public void standingPassengers(int standingPassengers)
    {
        if (standingPassengers > 0 && standingPassengers < 45)
            this.standingPassengers = standingPassengers;       //same thing as above, only the bus' passengers
    }

    public void setSittingPassengers(int sittingPassengers)
    {
        if (sittingPassengers > 0 && sittingPassengers < 25)
            this.sittingPassengers = sittingPassengers;         //again, only the bus' passengers.
    }

    public String getManufacturer()
    {
        String model = super.manufacturer + ", " + this.manufacturer; //again we're combining the vehicle class manufacturer with the bus manufacturer
        return model;
    }
}