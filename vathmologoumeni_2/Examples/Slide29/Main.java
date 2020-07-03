package vathmologoumeni_2.Examples.Slide29;

//Slide 184 of 208, Example 29 of 32
//Casting

public class Main
{
    public static void main(String[] args) 
    {
        //casting is when we want to actively convert a variable type to another type

        //here's a float
        float a1 = 15.9f;
        System.out.println(a1);

        //we can convert this float to an int, using another variable.
        int a2 = (int) a1;
        System.out.println(a2);

        //in order to do this with strings, we need to use special methods that often require try-catch
        String a3 = "15";
        try
        {
            int a4 = Integer.parseInt(a3);      //this is the static method to convert Strings to ints
            System.out.println("The variable a4 (" + a4 + ") has succesfully been converted.");
        }
        catch (Exception e)
        {
            System.out.println("This String cannot be converted to an int");
        }

        //of course this doesn't only work with primitive values, it works with objects.
        Student s1 = new Student(18, 175, "Giorgos", 19204, "University of Piraeus");
        s1.introduceSelf();
        s1.study();

        Human h1 = (Human) s1;
        h1.introduceSelf();
        //object h1 cannot study, because it has been casted to a human.
    }
}