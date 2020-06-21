package vathmologoumeni_2.Examples.Slide28;

//Slide 176 of 208, Example 28 of 32
//Variables

interface RunnableFile
{
    void run();
}

class File
{
    int sizeInBytes;
    String directory, name;
}

class Game extends File implements RunnableFile
{
    String gamePlatform, gameCompany;

    @Override
    public void run()
    {
        System.out.println("Running game: " + this.name);
    }
}


public class Main 
{
    public static void main(String[] args) 
    {
        //this is a File object; it has access to its own variables
        File f1         = new File();
        f1.name         = "Steam";
        f1.directory    = "D:/Steam";
        f1.sizeInBytes  = 500000000;

        //this is a Game object. Since it extends the File class it has its own variables plus all the variables from the File class.
        Game g1         = new Game();
        g1.name         = "Minecraft";
        g1.directory    = "D:/Games";
        g1.sizeInBytes  = 1342177280;
        g1.gamePlatform = "None";
        g1.gameCompany  = "Mojang";
        g1.run();

        //this one, although we're using the Game() constructor, it belongs to the File class, so the variables from the Game class don't exist.
        File f2         = new Game();
        f2.name         = "Origin";
        f2.directory    = "D:/Origin";
        f2.sizeInBytes  = 750000000;
        
        //this one, doesn't have any variable access, since it's being used from an interface
        RunnableFile r1  = new Game();
        r1.run();

        //this one 
        Object o1 = new File();
        o1.toString();
    }
}