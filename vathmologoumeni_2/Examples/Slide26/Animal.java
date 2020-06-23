package vathmologoumeni_2.Examples.Slide26;

//this is the prototype class
public class Animal 
{
    String animalName;
    int legs;

    public void eat()
    {
        System.out.println("[" + this.animalName + "]: This is tasty.");
    }
}

//this is the class that extends the super class
class Mammal extends Animal
{
    //(this is an initializer block, it gets executed when an instance gets created)
    {
        legs = 4;       //legs are from the super class
    }

    //but this is something only mammals can do
    public Mammal giveBirth()
    {
        return new Mammal();
    }
}

//this is a class that extends the Mammal class (which extends the Animal class)
class Cat extends Mammal
{
    {
        legs = 4;       //this means we still have the legs variable
        animalName = "Cat";     //and the animalName variable also
    }

    //this is something only a cat can do though
    public void hunt()
    {
        System.out.println("Target executed");
        super.eat();        //but a cat is mammal and mammals are animals and animals can eat, so cats can eat
    }
}