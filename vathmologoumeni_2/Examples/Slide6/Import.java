package vathmologoumeni_2.Examples.Slide6;
import vathmologoumeni_2.Examples.Slide6.Vehicles.*;        //here's the import statement. the star (*) indicates that all of the classes will be imported

//Slide 46 of 208, Example 6 of 32
//Import usage

public class Import
{
    public static void main(String[] args)
    {
        //now there is no need to use the entire name there
        Car c1 = new Car("Opel");
        c1.move(5, 3);
        c1.showCoords();
        
        Bus b1 = new Bus("Mercedes");
        b1.move(5, 5);
        b1.showCoords();
    }    
}