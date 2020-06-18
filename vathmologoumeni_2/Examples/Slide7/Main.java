package vathmologoumeni_2.Examples.Slide7;

//Slide 52 of 208, Example 7 of 32
//Static imports

import static vathmologoumeni_2.Examples.Slide7.Universities.Unipi.University;       //this contains a single variable
import static vathmologoumeni_2.Examples.Slide7.Universities.Unipi.makeAnnouncement; //this contains a single method
import static vathmologoumeni_2.Examples.Slide7.Universities.Unipi.*;                //or we can just import everything, because we're not sure how many static stuff there are.
//but this will only import static variables.

import vathmologoumeni_2.Examples.Slide7.Universities.Unipi;                         //this contains the whole class

public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("I'm currently a student in the " + University + ". I can make an announcement.");
        makeAnnouncement("Attention. We're testing the static imports.");
        Department = "Informatics";
        System.out.println("Every static variable is included here. Including the Department we just set: " + Department);
        System.out.println("Or even the number of total students: " + totalStudents);

        //in order to access the non-static members of the class we have to create an object.
        Unipi u1 = new Unipi();
        u1.name = "Giorgos";
        System.out.println("\nThis is a non-static member, which we had to make an object to have access to: " + u1.name);
    }
}