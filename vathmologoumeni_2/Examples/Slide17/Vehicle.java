public abstract class Vehicle
{
    //these are the instance variables and since they're private, we'll need a way to set them
    private float x, y;

    public static final String manufacturer = "Unipi"; //keep your eye to this variable

    //this is the main constructor (super)
    public Vehicle()
    {
        this.x = this.y = 0f;
        this.availablePassengers = 0;
        this.name = "";
    }

    public void setName(String name)
    {
        this.name = name;   //this is going to set the instance's name (left from the equals sign) equal with the parameter's name (right from the equals)
    }

    public void move(float x, float y)
    {
        this.x += x;        //same thing. we're adding the parameter's value to the instance's value
        this.y += y;
    }

    public void setPassengers(int availablePassengers)
    {
        this.availablePassengers = availablePassengers;
    }
}

class Car extends Vehicle
{
    public static final String manufacturer = "CsUnipiCar";  //this is the same name as the vehicle class
    private int passengers;

    public Car()
    {
        super(); //this is calling the Vehicle constructor. this way, we can clone the vehicle class constructor to the extended class constructor
    }

    public void setPassengers(int passengers)
    {
        if (passengers > 0 && passengers < 8)
            this.passengers = passengers;         //this is setting the instance's passengers (it must be a car) equal with the parameter's
    }

    public String getManufactuer()
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
    }

    public void standingPassengers(int standingPassengers)
    {
        if (standingPassengers > 0 && standingPassengers < 45)
            this.standingPassengers = standingPassengers;       //same thing as above, only the bus' passengers
    }

    public void setSittingPassengers(int sittingPassengers)
    {
        
    }
}