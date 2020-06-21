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

        //and we can output the list to a String like this
        System.out.println(integers.toString());

        //now the size of the list is 3.
        System.out.println(integers.size());

        //we can remove any object by identifying its index
        integers.remove(2);
        System.out.println(integers.toString());
        System.out.println("Number 26 got removed because the first element is 0.");

        integers.add(29);
        integers.add(39);
        integers.add(21);

        //now that we added more elements to the list, there are four ways we can display/access them

        //Method 1. toString
        System.out.println("1st method 'toString()':");
        System.out.println(integers.toString() + "\n");

        //Method 2. foreach
        System.out.println("2nd method 'foreach':");
        for (Integer i : integers)
        {
            System.out.println(i);
        }

        //Method 3. hard coded for
        System.out.println("\n3rd method 'hard corded for loop':");
        for (int i = 0; i < integers.size(); i++)
        {
            System.out.println(integers.get(i));
        }
    }
}