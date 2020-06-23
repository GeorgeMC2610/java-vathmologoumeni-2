package vathmologoumeni_2.Askiseis.Exercise2;

import java.util.ArrayList;
import java.util.ListIterator;

//Slide 133 of 208, Excercise 2 of 3
//Try to modify the elements of a list.

public class Main 
{
    public static void main(String[] args) 
    {
        //creating of the list
        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(19);
        ints.add(29);
        ints.add(42);
        ints.add(46);
        ints.add(35);
        ints.add(76);

        System.out.println("Current state of the list: " + ints.toString());
        System.out.println("With regular for loops we can just modify elements, e.g. adding 5 to each element of the list.");

        //in a loop we can only modify the elements of a list:
        for (int i = 0; i < ints.size(); i++)
        {
            //a very complex way to say 'add 5 to each element of the list'
            ints.set(i, ints.get(i) + 5);
        }

        System.out.println("Current state of the list: " + ints.toString());
        System.out.println("We can't add or remove something from the list in a loop!");
        System.out.println("For that purpose we're going to use an iterator.");

        //for that purpose there is the list iterator
        ListIterator<Integer> iterator = ints.listIterator();

        while (iterator.hasNext())
        {
            //we can now remove any even element
            if (iterator.next() % 2 == 0)
                iterator.remove();
        }

        System.out.println("Current state of the list: " + ints.toString());


        //and we can do this with reverse traversion
        while (iterator.hasPrevious())
        {
            //we can also now add elements
            if (iterator.previous() % 2 != 0)
                iterator.add(10);
        }

        System.out.println("We can also do this with backwards traversion.");
        System.out.println("Current state of the list: " + ints.toString());
    }
}