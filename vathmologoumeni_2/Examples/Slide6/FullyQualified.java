package vathmologoumeni_2.Examples.Slide6;

//Slide 46 of 208, Example 6 of 32
//Fully qualified names

public class FullyQualified
{
    public static void main(String[] args) 
    {
        //since we're not using an import statement, the entire package declaration is needed to make a Car object.
        vathmologoumeni_2.Examples.Slide6.Vehicles.Car c1 = new vathmologoumeni_2.Examples.Slide6.Vehicles.Car("Opel");
        //all of its functions can be used normally since we can now use the class
        c1.move(5, 3);
        c1.showCoords();

        vathmologoumeni_2.Examples.Slide6.Vehicles.Bus b1 = new vathmologoumeni_2.Examples.Slide6.Vehicles.Bus("Mercedes");
        b1.move(5, 5);
        b1.showCoords();
    }
}