package vathmologoumeni_2.Examples.Slide8;

public class Modifiers 
{
    //these are four variables, each one with a different access modifier.

    static public    int year = 2015;     //this variable is visible to everything.
    static private   int AFM  = 884;      //this one is only visible in this Class. even if we create another class in the same file, it wouldn't be visible
    static int aaaaa = 20;
    static protected int age  = 19;      //this one will be visible only to this package

    //even though the AFM variable is private, we can return it (but not modify it) through a public method. 
    public static int getAFM()
    {
        return AFM;
    }
}