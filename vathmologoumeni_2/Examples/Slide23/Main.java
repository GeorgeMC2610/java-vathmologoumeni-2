package vathmologoumeni_2.Examples.Slide23;

import java.util.ArrayList;

//Slide 127 of 208, Example 23 of 32
//Java ArrayList

public class Main 
{
    public static void main(String[] args)
    {
        //we just declared a new list with integers
        ArrayList<Integer> integers = new ArrayList<>();

        //this list can contain integers of any type, 'int' and 'Integers'
        int a1 = 15;
        Integer a2 = 19;

        integers.add(a1);
        integers.add(a2);
        integers.add(26);

        System.out.println(integers.toString());
    }
}