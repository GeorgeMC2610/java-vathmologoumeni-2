package vathmologoumeni_2.Examples.Slide29;

public class Human 
{
    private int age, height;
    private String name;
    
    public Human(int age, int height, String name)
    {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void introduceSelf()
    {
        System.out.println("Hello! My name is " + this.name + ", I am " + this.age + " years old and I'm " + this.height + " cm tall.");
    }
}

class Student extends Human
{
    private int AM;
    private String university;
    
    public Student(int age, int height, String name, int AM, String university)
    {
        super(age, height, name);
        this.AM = AM;
        this.university = university;
    }

    public void study()
    {
        System.out.println("Silence, please. I have to be ready...");
    }
}