package vathmologoumeni_2.Examples.Slide10.Classes;

//this class can only be derived and not instanciated
public abstract class University
{
    protected int totalStudents, departments;

    //this method, though, is final, which means that we cannot change it or override it through other subclasses
    public final void makeAnnouncement(String announcement)
    {
        System.out.println("ATTENTION: " + announcement);
    }
}