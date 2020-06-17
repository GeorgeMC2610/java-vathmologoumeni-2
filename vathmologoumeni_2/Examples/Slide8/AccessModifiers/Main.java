package vathmologoumeni_2.Examples.Slide8.AccessModifiers;
import vathmologoumeni_2.Examples.Slide8.*;

public class Main
{
    public static void main(String[] args) {

        System.out.println("This is a seperate package. How many variables can we see and modify through here?");

        System.out.println("\nThe 'year' variable is public. It can be seen through seperate packages: " + Modifiers.year);
        Modifiers.year = 2034;
        System.out.println("Public variables can be modified: " + Modifiers.year);

        System.out.println("\nAny other variable is either set as protected, default or private, which means we don't get to see or modify those variables.");
        System.out.println("Luckily, we have some 'getter' methods for the 'AFM' and 'height' variables with public access to them, which means we can see the variables.");
        System.out.println("AFM: " + Modifiers.getAFM() + ", Height: " + Modifiers.getHeight());

    }
}