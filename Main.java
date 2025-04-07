public class Main
{
    public static void main(String[] args)
    {
        ShoppingCart cart = new ShoppingCart();

        cart.add(new Item("Milk", 3.50));
        cart.add(new DiscountedItem("Apples", 2.00, 0.50));
        cart.add(new DiscountedItem("Bread", 2.50, 0.25));
        cart.add(new Item("Eggs", 4.00));

        cart.printOrder();
    }
}
