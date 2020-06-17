package vathmologoumeni_2.Examples.Slide21;

//Slide 122 of 208, Example 21 of 32
//String comparisons 

public class Main 
{
    public static void main(String[] args)
    {
        //we have two variables with equal values
        String name1 = new String("Giorgos");
        String name2 = "Giorgos";
        String name3 = name2;

        //if we try to compare them using the '==' operator we see something odd
        System.out.println(name2 == name3);
        System.out.println("This seems good so far.");

        //but...
        System.out.println(name1 == name2);     //false
        System.out.println("Why did this happen? " + name1 + " and " + name2 + " have the same value...");

        //the system gets it as false because it doesn't compare the values. in order to compare values, we need the equals method.
        System.out.println(name1.equals(name2));
        System.out.println("That's more like it.");

        System.out.println("name1.equals(name2) was used, and not name1 == name2.");
    }    
}