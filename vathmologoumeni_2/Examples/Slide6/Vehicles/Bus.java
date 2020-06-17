package vathmologoumeni_2.Examples.Slide6.Vehicles;

public class Bus 
{
    int x, y;
    String model;
    
    public Bus(String model)
    {
        this.model = model;
        this.x = 0;
        this.y = 0;
    }

    public void park()
    {
        this.x = 0;
        this.y = 0;
        System.out.println("Bus parked successfully.");
    }

    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void showCoords()
    {
        System.out.println(this.model + " is at: " + this.x + ", " + this.y);
    }
}