package vathmologoumeni_2.Examples.Slide20;

public final class Student 
{
    private int age, AM, semester;
    private String fullname, departmentName;

    //below there are three constructors, but none of them assures that the age, AM and semester variables will be initialized.
    //for that purpose we must declare an initializer block
    {
        //whatever happens, every student will have an age, an AM and semester variables initialized.
        this.age = 18;
        this.AM = -1;
        this.semester = 1;
    }

    //this constructor doesn't initialize the age, AM or semester variables. If there wasn't an initializer block, those variables would be null
    public Student(String fullname, String departmentName)
    {
        this.fullname = fullname;
        this.departmentName = departmentName;
    }

    public Student(int age, String fullname, String departmentName)
    {
        this.age = age;
        this.fullname = fullname;
        this.departmentName = departmentName; 
    }

    public Student(int age, int AM, int semester, String fullname, String departmentName)
    {
        this.age = age;
        this.AM = AM;
        this.semester = semester;
        this.fullname = fullname;
        this.departmentName = departmentName;
    }

    public void describeMe()
    {
        System.out.println("My name is: " + this.fullname);
        System.out.println("I am " + this.age + " years old.");
        System.out.println((this.AM < 0)? "I don't have an AM yet." : "My AM is: " + this.AM);         //ternary operator if the AM is -1, we know it's not user-defined.
        System.out.println("This is my #" + this.semester + " Semester in the " + this.departmentName);
    }
}