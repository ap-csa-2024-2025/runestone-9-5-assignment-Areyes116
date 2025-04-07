public class Animal
{
    // Instance variables
    private String name;
    private String species;

    // Default constructor
    public Animal()
    {
        this.name = "";
        this.species = "";
    }

    // Non-default constructor
    public Animal(String name, String species)
    {
        this.name = name;
        this.species = species;
    }

    // Mating call method
    public void matingCall()
    {
        System.out.println("generic sounds");
    }
}
