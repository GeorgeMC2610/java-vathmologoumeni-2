package vathmologoumeni_2.Examples.Slide9;
import vathmologoumeni_2.Examples.Slide9.Classes.*;

//Slide 83 of 208, Example 9 of 32
//Abstract classes & methods

public class Main
{
    public static void main(String[] args) 
    {
        //we can create a car using the Car constructor
        Car c1 = new Car("Opel");

        //or an airplane
        Airplane a1 = new Airplane("Boeing");

        //all the methods are available, including methods found in the Vehicle class
        a1.announceModel();
        c1.announceModel();

        //both can move
        a1.move(3f, 3f);
        c1.move(5f, 5f);

        //the airplane has also the ability to fly.
        a1.fly(2f, 2f, 5f);

        //another way to create an Airplane is to make it through a Vehicle
        Vehicle a2 = new Airplane("Boeing-777");
        a2.announceModel();

        //this airplane can also move
        a2.move(4f, 3f);

        //but it cannot fly, because we constructed it through the Vehicle() method.
    }
}