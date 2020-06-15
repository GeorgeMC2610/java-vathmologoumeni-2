//Slide 99 of 208, Example 15 of 32
//Variable Arguements (Varargs)

public class Main
{
    public static void main(String[] args)
    {
        displayList(4,5,3,6,3,1);       //we can display a temporary list
        System.out.println("List displayed using varargs.\n");
        
        int[] a1 = {4,5,3,6,3,1};
        displayList(a1);                //or a normal list
        System.out.println("List displayed by defining a normal list.\n");

        a1 = multiplyByNumber(5.0f, a1);        //every element of a1 will now be multiplied by 5, as the method is supposed to
        displayList(a1);
        System.out.println("We just multiplied every element with 5.\n");

        a1 = multiplyByNumber(5.0f, 1,2,3,4,5,6,7,8,9,10);      //although now, since we used a new list in the varargs, it will be overwritten in the old list
        displayList(a1);
        System.out.println("Brand new list using varargs.\n");

    }

    //simple varargs display
    public static void displayList(int... ints)         //only one parameter; the varargs
    {
        for (int i = 0; i < ints.length; i++)
        {
            System.out.println(i+1 + ". " + ints[i]);
        }
    }

    public static int[] multiplyByNumber(float m, int... ints)      //this time we're using more than one parameter, thus varargs has to be the last one
    {
        for (int i = 0; i < ints.length; i++)
            ints[i] *= m;

        return ints;
    }
}