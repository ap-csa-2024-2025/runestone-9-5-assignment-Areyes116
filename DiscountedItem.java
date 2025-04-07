// DiscountedItem inherits from Item
public class DiscountedItem extends Item
{
    // instance variable for the discount
    private double discount;

    // Constructor with name, price, and discount
    public DiscountedItem(String name, double price, double discount)
    {
        super(name, price);
        this.discount = discount;
    }

    // Getter for discount
    @Override
    public double getDiscount()
    {
        return discount;
    }

    // Setter for discount
    public void setDiscount(double discount)
    {
        this.discount = discount;
    }

    // toString method that includes discount
    @Override
    public String toString()
    {
        return super.toString() + " (" + "-" + super.valueToString(discount) + ")";
    }
}
