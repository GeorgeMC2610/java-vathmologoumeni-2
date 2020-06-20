package vathmologoumeni_2.Examples.Askisi2;

import java.util.ArrayList;
import java.util.ListIterator;

//Slide 133 of 208, Excercise 2 of 3
//Try to modify the elements of a list.

public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(19);
        ints.add(29);
        ints.add(42);
        ints.add(46);
        ints.add(35);
        ints.add(76);

        ListIterator<Integer> iterator = ints.listIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        
    }
}