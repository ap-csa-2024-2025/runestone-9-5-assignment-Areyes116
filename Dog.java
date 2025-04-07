public class Dog extends Animal
{
    // Default constructor
    public Dog()
    {
        super("Unnamed Dog", "Dog");
    }

    // Non-default constructor
    public Dog(String name)
    {
        super(name, "Dog");
    }

    // Override matingCall method
    @Override
    public void matingCall()
    {
        System.out.println("Woof woof!");
    }
}
