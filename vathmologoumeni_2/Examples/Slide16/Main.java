//Slide 100 of 208, Example 16 of 32
//Instance of Operator

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Even though two classes might implement the same interface, it does not mean they're the same instance.");

        Vehicle car1 = new Car();      //here we create a new car vehicle.
        Vehicle airplane1 = new Airplane(); //here we create a new airplane vehicle.

        //even though they both implement the 'Vehicle' interface...
        System.out.println("Is a Car an instance of a Vehicle? --> "        + (car1 instanceof Vehicle));
        System.out.println("Is an Airplane an instance of a Vehicle? --> "  + (airplane1 instanceof Vehicle));

        //...they have different instances
        System.out.println("\nIs a Car an instance of an Airplane? --> " + (car1 instanceof Airplane));
        System.out.println("Is an Airplane an instance of a Car --> "    + (airplane1 instanceof Car));

        //although we must be really careful about how we cast the variables.
        //up above we made car and airplane objects through the 'Vehicle' interface
        //what happens if we make two objects through the same class?

        Car car2 = new Car();
        Airplane airplane2 = new Airplane();

        //these are still 'Vehicle' instances
        System.out.println("\nIs a Car an instance of a Vehicle? --> "        + (car2 instanceof Vehicle));
        System.out.println("Is an Airplane an instance of a Vehicle? --> "  + (airplane2 instanceof Vehicle));

        //but...
        System.out.println("\nIf we try to make an (car2 instance of Airplane) arguement, it doesn't output 'false,' it outputs an error.");
    }    
}