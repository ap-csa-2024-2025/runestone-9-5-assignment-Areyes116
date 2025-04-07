public class Cat extends Animal
{
    // Default constructor
    public Cat()
    {
        super("Unnamed Cat", "Cat");
    }

    // Non-default constructor
    public Cat(String name)
    {
        super(name, "Cat");
    }

    // Override matingCall method
    @Override
    public void matingCall()
    {
        System.out.println("Meow meow!");
    }
}
