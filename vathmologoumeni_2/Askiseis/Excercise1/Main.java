package vathmologoumeni_2.Askiseis.Excercise1;

//Slide 123 of 208, Excercise 1 of 3
//Do the String class methods affect the String pool?

public class Main 
{
    public static void main(String[] args) 
    {
        //let's consider the existence of two identical strings
        String s1 = "AAAAA";        //this String gets saved in the string pool,
        String s2 = "AAAAA";        //this String, as long as is not declared as 'new String()', gets the String value from the String pool, so it doesn't affect it
        
        //so this should output true
        System.out.println(s1 == s2);

        //although, do Strings that get returned from methods by the String class, like 'valueOf', have any effect in the String pool?
        String s3 = String.valueOf(55.0);
        String s4 = String.valueOf(55.0);
        String s5 = "55.0";

        //since none of them, not even s3 and s4 which are completely identical declarations, output true, it means that they get saved seperately.
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println("It looks like the String pool has three new values from three identical variables.");
    }
}