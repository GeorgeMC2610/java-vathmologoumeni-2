package vathmologoumeni_2.Examples.Slide10.Classes;

//this class cannot be derived, and can only be instanciated
public final class Unipi extends University
{
    //these two variables are final, they cannot change. they stay the same by the time they're declared
    public static final String name = "University Of Piraeus";
    public static final String address = "Karaoli & Dimitriou 80, Piraeus 18534";

    protected String departmentName;
    protected int departmentStudents;

    public Unipi(String deprartmentName, int departmentStudents)
    {
        this.departmentName = deprartmentName;
        this.departmentStudents = departmentStudents;
    }
}