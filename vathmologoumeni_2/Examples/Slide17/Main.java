package vathmologoumeni_2.Examples.Slide17;

//Slide 104 of 208, Example 17 of 32
//'this' and 'super'

public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        c1.move(5f, 3f);        //changed only the car's coordinates.
        c1.announceCoordinates();

        Bus b1 = new Bus();
        b1.move(2.5f, 1.5f);    //changed only the bus' coordinates.
        b1.announceCoordinates();

        //even though these instances have different class manufacturers (CsUnipiCar, UnipiBus), they have the same Vehicle manufacturers (Unipi)
        System.out.println(c1.getManufacturer());       
        System.out.println(b1.getManufacturer());
    }
}