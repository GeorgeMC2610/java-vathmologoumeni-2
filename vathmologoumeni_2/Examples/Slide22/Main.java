package vathmologoumeni_2.Examples.Slide22;

//Slide 124 of 208, Example 22 of 32
//Mutable Strings

public class Main 
{
    public static void main(String[] args) 
    {
        //this block of code will output to the screen all numbers from 0 to 99 sticked in a single string.
        String a = "";

        for (int i = 0; i < 100; i++)
        {
            a += i;
        }

        System.out.println(a);
        //this is an extremely redundant method, because all those Strings are immutable and get saved in the String pool, so we want something mutable

        //this is a mutable string
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < 100; i++)
        {
            //it doesn't save any of those strings, until we get to the very end.
            stringbuilder.append(i);
        }

        //here's the string which gets saved in the string pool.
        System.out.println(stringbuilder.toString());
    }    
}