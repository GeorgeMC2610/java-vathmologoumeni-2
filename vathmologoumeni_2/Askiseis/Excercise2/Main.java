package vathmologoumeni_2.Askiseis.Excercise2;

import java.util.ArrayList;
import java.util.ListIterator;

//Slide 133 of 208, Excercise 2 of 3
//Try to modify the elements of a list.

public class Main 
{
    public static void main(String[] args) 
    {
        //creating of the list
        ArrayList<Integer> ints = new ArrayList<Integer>();

        ints.add(19);
        ints.add(29);
        ints.add(42);
        ints.add(46);
        ints.add(35);
        ints.add(76);
        System.out.println("Current state of the list: " + ints.toString());

        //in a loop we can only modify the elements of a list:
        for (int i = 0; i < ints.size(); i++)
        {
            //a very complex way to say 'add 5 to each element of the list'
            ints.set(i, ints.get(i) + 5);
        }

        System.out.println("Current state of the list: " + ints.toString());
        System.out.println("We can't add or remove something from the list in a loop!");

        //for that purpose there is the list iterator
        ListIterator<Integer> iterator = ints.listIterator();

        while (iterator.hasNext())
        {
            
        }

        System.out.println("Current state of the list: " + ints.toString());

        
    }
}