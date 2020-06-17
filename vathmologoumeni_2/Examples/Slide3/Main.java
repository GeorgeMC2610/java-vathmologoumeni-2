package vathmologoumeni_2.Examples.Slide3;

//Slide 21 of 208, example 3 of 32
//Autoboxing - Unboxing

public class Main
{
    public static void main(String[] args) 
    {
        Integer a1 = 15;
        int a2     = 30; 

        //since we declared a1 as an Integer, it has all the methods-attributes from the object class
        System.out.println("The luxury of being non-primitive value!");
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.equals(a2));

        //a2 doesn't have any of these methods. It's just an int.
        System.out.println("An 'int' doesn't have such attributes!");
        System.out.println(a2);
    }
}