package vathmologoumeni_2.Examples.Slide8;

//Slide 66 of 208, Example 8 of 32
//Access modifiers

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("The 'year' variable is public, so it's visible here: " + Modifiers.year);
        Modifiers.year = 2010;
        System.out.println("Not only is it visible, but we can change it to whatever we want: " + Modifiers.year);

        System.out.println("\nThe 'age' variable is protected, which means it's visible as long as we are in the same package: " + Modifiers.age);
        Modifiers.age = 24;
        System.out.println("Changing a protected variable is also an option: " + Modifiers.age);

        System.out.println("\nSame thing happens with a default variable: " + Modifiers.height);
        Modifiers.height = 196;
        System.out.println("Defaults can be changed as well: " + Modifiers.height);

        System.out.println("\nThe 'AFM' variable is NOT visible by default. Although using a method with public access, we can see it: " + Modifiers.getAFM());
        System.out.println("Which means it's read only. We cannot change it. We would need setter method in order to modify it.");
    }
}