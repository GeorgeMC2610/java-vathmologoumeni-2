package vathmologoumeni_2.Examples.Slide11;

public class Company 
{
    int employees;
    String companyName, CEO;

    //a static variable is visible to everyone.
    static String country = "Greece";
    
    public void hire(String name)
    {
        System.out.println("Congratulations! " + name + " is now part of " + this.companyName + "!");
    }

    //a static method, is also visible to everyone
    public static void announce(String announcement)
    {
        System.out.println("ATTENTION ALL: " + announcement);
    }
    

    interface Human
    {
        public void talk(String sentence);
    }

    static class Employee implements Human
    {
        String name;
        int age;

        @Override
        public void talk(String sentence)
        {
            System.out.println("As an employee, I have to say: " + sentence);
        }
    }
}