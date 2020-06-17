package vathmologoumeni_2.Examples.Slide30;

//Slide 190 of 208, Example 30 of 32
//Extending an existing class

public class Main 
{
    public static void main(String[] args) 
    {
        //here we create a new Professor object and we normally use our makeAnnouncement method.
        Professor p1 = new Professor("Giorgos");
        p1.makeAnnouncement("All students, please take your seats.");

        //but what if we effectively wanted to change the method and use it only once?
        new Professor("Yiannis")
        {
            @Override
            public void makeAnnouncement(String announcement)
            {
                System.out.println("This method is only used once. All I have to say is: " + announcement);
            }
        }.makeAnnouncement("launch break is at 10:30AM only for today");       //we have to immediately use the method, or else it 'dies'

        //or we can make a new method altogether that is used only once
        new Professor("Costas")
        {
            public void saySomething()
            {
                System.out.println("Since this class extends the Parentclass, all variables declared as 'private' cannot be used.");
            }
        }.saySomething();
    }
}