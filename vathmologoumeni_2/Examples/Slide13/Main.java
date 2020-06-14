//Slide 91 of 208, Example 13 of 32
//Variable scope

public class Main
{
    public static void main(String[] args)
    {
        //this is a local variable. As soon as the 'main' method closes, this varible will 'die.'
        int age = 18;
        System.out.println(age);  //18

        Test.greet("George"); //this is a method parameter.
        System.out.println(Test.addTwoNumbers(age, 3));  //method parameters can even contain local variables.

        Test t1 = new Test();
        Test t2 = new Test();

        t1.department = "Informatics";          //This is changing the instance variable "department"
        t2.department = "Digital Systems";

        System.out.println("t1 is part of the " + t1.department + " department.");
        System.out.println("t2 is part of the " + t2.department + " department.");
        System.out.println("But both attend in " + Test.university + ".");    //static variables, should be accessed through a static way.
    }
}

class Test
{
    //this is a class variable. It can be changed, although it should be accessed in a static way, not through an instance. It's the same for all instances.
    public static String university = "University of Piraeus";

    //this is an instance variable. It's different for every instance. 
    public String department;

    public static void greet(String username)  //this is a method parameter.
    {
        System.out.println("Hello, " + username + ".");
        //it's almost the same thing as the local variable; it dies when the method ends.
    }

    public static int addTwoNumbers(int a, int b)
    {
        return a+b;
        //like all variables, method parameters can be returned.
    }
}