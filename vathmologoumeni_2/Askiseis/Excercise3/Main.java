package vathmologoumeni_2.Askiseis.Excercise3;

import java.util.ArrayList;

//Slide 137 of 208, Excercise 3 of 3
//toArray() and clone() methods

public class Main 
{
    public static void main(String[] args) 
    {
        //we assume we have a list using rhe ArrayList library with floats
        ArrayList<Float> F1 = new ArrayList<>();
        F1.add(45.3f);
        F1.add(4.92f);
        F1.add(91f);
        F1.add(92.3f);

        System.out.println("This is the ArrayList:");
        for (Float f : F1)
        {
            System.out.println(f);
        }
        
        //we can convert this list to a normal array, using toArray() method
        Float[] F2 = new Float[F1.size()];      //so for that purpose we create an Array with the same size as the ArrayList
        F2 = F1.toArray(F2);

        System.out.println("\nThis is the ArrayList converted to a default Java Array:");
        for (Float f : F2)
        {
            System.out.println(f);
        }

        //we can also clone this list
        Float[] F3 = F2.clone();

        System.out.println("\nAnd this is the clone of the list:");
        for (Float f : F3)
        {
            System.out.println(f);
        }
    }
}