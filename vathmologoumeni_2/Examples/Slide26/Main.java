package vathmologoumeni_2.Examples.Slide26;

//Slide 144 of 208, Example 26 of 32
//Switch vs If

public class Main 
{
    public static void main(String[] args) 
    {
        //we have this variable and we want to determine a day by its value
        short day = 6;

        //there are two ways.
        //1. many IF statements
        if (day == 1)
            System.out.println("Monday");
        else if (day == 2)
            System.out.println("Tuesday");
        else if (day == 3)
            System.out.println("Wednesday");
        else if (day == 4)
            System.out.println("Thursday");
        else if (day == 5)
            System.out.println("Friday");
        else if (day == 6)
            System.out.println("Saturday");
        else if (day == 7)
            System.out.println("Sunday");
        else
            System.out.println("This is not a weekday.");
        
        //the second way is much cleaner
        //switch case
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("This is not a weekday.");
        }
    }
}