package vathmologoumeni_2.Examples.Slide6.Vehicles;

public class Car
{
    int x, y;
    String model;

    public Car(String model)
    {
        this.x = 0;
        this.y = 0;
        this.model = model;
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