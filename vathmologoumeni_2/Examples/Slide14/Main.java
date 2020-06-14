//Slide 98 of 208, Example 14 of 32
//Method return statement

public class Main
{
    public static void main(String[] args)
    {
        int a1 = factorial(5);      //a returned method can be either held in a variable
        System.out.println("5! = " + a1);

        System.out.println("5! = " + factorial(5));     //or it can be directly output in the console.
        announceSomething("Even though the method is void, we can still use a 'return' command. Except it can't be followed by a variable.");
    }

    //here's a simple return method. Not only must we return a variable, it must also be an 'int.'
    public static int factorial(int x)
    {
        int fact = 1;
        for (int i = 1; i <= x; i++)
            fact *= i;
        
        return fact;    //we return one variable and since the method is declared 'int,' the variable we return is also an 'int.'
    }

    //here's a void method
    public static void announceSomething(String message)    //even though there are required parameters to this method, it doesn't return anything.
    {
        if (message.length() <= 1)
        {
            System.out.println("Empty message.");
            return;             //since it's 'void' we must not return any variable. An 'empty' return statement ignores the rest of the method's code.
        }

        System.out.println("[IMPORTANT NOTE]: " + message);
    }
}