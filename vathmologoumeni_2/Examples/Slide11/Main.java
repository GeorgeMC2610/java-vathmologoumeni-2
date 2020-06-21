package vathmologoumeni_2.Examples.Slide11;

//Slide 11 of 32, Example 11 of 32
//Static

public class Main
{
    public static void main(String[] args) 
    {
        //we can declare a class like usual
        Company apple = new Company();
        apple.companyName = "Apple Inc.";
        apple.employees = 137000;
        apple.CEO = "Steve Jobs";
        apple.hire("Bill Gates");

        //but a nested class, is accessed through the top level class
        Company.Employee e1 = new Company.Employee();
        e1.name = "George";
        e1.age = 18;
        e1.talk("I don't have acces to the variables from the 'Company' class. I only have access to static ones.");

        //static variables are visible through instances
        System.out.println("I can see the country through an instance: " + apple.country);

        //and through the class itself
        System.out.println("I can see the country through the class: " + Company.country);

        //same thing happens with the methods
        apple.announce("This is an instance speaking.");
        Company.announce("This is the class speaking, actually.");
    }
}