package vathmologoumeni_2.Examples.Slide18;

//Slide 110 of 208, Example 18 of 32
//Method overloading

public class Main
{
    public static void main(String[] args)
    {
        //we can have methods with the same name, doing different things
        //but we have to change several stuff in order to work

        int   a = addTwoNumbers(1,1);
        float b = addTwoNumbers(1f, 1f);
        int   c = addTwoNumbers();
        short d = addTwoNumbers((short) 1, (short) 1);

        System.out.print(a + ", " + b + ", " + c + ", " + d + ", ");
        addTwoNumbers(2);

        //all of these should output 2. but let's see why this works
    }

    //here's the method prototype
    public static int addTwoNumbers(int a, int b)
    {
        return a+b;
    }

    //this method does exactly the same thing, except it's for floats, all we had to do is to change the parameters; we made them floats
    public static float addTwoNumbers(float a, float b)
    {
        return a+b;
    }

    //same thing here, except it's for shorts
    public static short addTwoNumbers(short a, short b)
    {
        return (short)(a+b);
    }

    //the return type here is the same as the prototype's, but it doesn't have any parameters, thus it's getting overloaded
    public static int addTwoNumbers()
    {
        return 2;
    }

    //this is still overloading, even though the method is private and void.
    private static void addTwoNumbers(int a)
    {
        System.out.println(a);
    }
}