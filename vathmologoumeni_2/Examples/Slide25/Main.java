package vathmologoumeni_2.Examples.Slide25;

//Slide 139 of 208, Example 25 of 32
//Ternary operator

public class Main 
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 18;
        int c = 39;

        int max;
        max = (a < b)? b : a;
        max = (b < c)? c : b;
        max = (a < c)? c : a;
        
        System.out.println(max);

    }
}