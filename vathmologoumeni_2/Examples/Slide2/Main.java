package vathmologoumeni_2.Examples.Slide2;
//slide 13 of 208, example 2 of 32
//char vs string

public class Main
{
    public static void main(String[] args)
    {
        char c = 'D';
        System.out.println("Char declarations are only done with single quotes: " + c);

        String s = "Daniel";
        System.out.println("String declarations are only done with double quotes: " + s);

        //the code below won't work.
        /*

        char l = "D";
        String p = 'Daniel';
        
        */
    }
}