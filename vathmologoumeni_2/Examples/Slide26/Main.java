package vathmologoumeni_2.Examples.Slide26;

//Slide 161 of 208, Example 26 of 32
//Inheritance

public class Main
{
    public static void main(String[] args)
    {
        //we're going to create a spider. since there's no preset spider animal, we're going to make one 
        Animal a1 = new Animal();
        a1.legs = 8;
        a1.animalName = "Spider";
        a1.eat();

        //we're going to create an elephant
        Mammal a2 = new Mammal();
        a2.animalName = "Elephant";         //since mammals extend the animal class, they have an 'animalName' variable
        System.out.println("Since elephants are mammals, they have by default " + a2.legs + " legs.");
        a2.eat();

        //we're going to create a cat, since there's a preset for such animal. 
        Cat a3 = new Cat();
        System.out.println("The initializer block for cats sets both the name and the legs variable, so we don't neet to set them.");
        a3.hunt();
    }
}