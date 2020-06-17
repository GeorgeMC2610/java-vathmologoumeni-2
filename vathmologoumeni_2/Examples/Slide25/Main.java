package vathmologoumeni_2.Examples.Slide25;

//Slide 139 of 208, Example 25 of 32
//Ternary operator

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println( absoluteValue(-4) );     //the function with the ternary operator returns an int.
        System.out.println( absoluteValue(-4f));     //the hard-coded function returns a float.
        System.out.println("These two functions do the same thing, except it's done with a ternary operator in the first one.");
    }

    //these two function do exactly the same thing.
    //this one does it with a ternary operator
    public static int absoluteValue(int i)
    {
        return (i < 0)? -i : i;     //inside the parenthesis there is the expression. if it is true, then the left side of the ':' gets executed. if it's false, the left side gets executed?
    }

    //here's the same thing, except it's more obvious for what's happening.
    public static float absoluteValue(float i)
    {
        if (i < 0)
            return -i;
        else
            return i;
    }
}