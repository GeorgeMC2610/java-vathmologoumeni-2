package vathmologoumeni_2.Examples.Slide16;

public interface Vehicle
{
    public void park();
    public void move(int x, int y);
}

class Car implements Vehicle
{
    private int x, y;

    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void park()
    {
        System.out.println("Car parked successfully.");
    }
}

class Airplane implements Vehicle
{
    private int x, y, z;

    public void move(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void fly(int z)
    {
        this.z += z;
    }

    public void park()
    {
        System.out.println("Airplane parked successfully.");
    }
}