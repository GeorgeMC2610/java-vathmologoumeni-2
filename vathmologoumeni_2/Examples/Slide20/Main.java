package vathmologoumeni_2.Examples.Slide20;

//Slide 115 of 208, Example 20 of 32
//Initializer blocks

public class Main
{
    public static void main(String[] args)
    {
        //this object is fully initialized, because we chose the constructor that initializes all the variables
        Student s1 = new Student(19, 19204, 3, "Giorgos Seimenis", "Department of Informatics");

        //although this one incomplete
        Student s2 = new Student("Akis Papadopoulos", "Department of Economic Studies");

        //let's describe those two variables.
        s1.describeMe();
        System.out.println("");
        s2.describeMe();

        System.out.println("\nWe did not set an age or an AM or even a semester for Akis, but the initializer block made sure that Akis would have such variables.");

    }
}