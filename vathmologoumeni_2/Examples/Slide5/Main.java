//Slide 41 of 208, Example 5 of 32
//Top level public classes-interfaces

//This is NOT the top level public class. Even though it's the first one to appear, it's not the main class.
class Professor implements Human
{
    public void walk()
    {
        System.out.println("I'm a professor and I'm walking.");
    }

    public void startLecture()
    {
        System.out.println("Everyone take a seat, the lecture's starting.");
    }
}

//This is the top level public class that has to have the same name as the file name.
public class Main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.walk();
        s1.study();

        Professor p1 = new Professor();
        p1.walk();
        p1.startLecture();
    }
}

//This is an interface within the same file as the top level public class. Any access modifier will make it stop working since interfaces can only be public.
interface Human
{
    public void walk();
}

//The same thing happens with the classes. Any other access modifier will make it stop working.
class Student implements Human
{
    public void walk()
    {
        System.out.println("I'm a student and I'm walking.");
    }

    public void study()
    {
        System.out.println("I'm studying.");
    }
}