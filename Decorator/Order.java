package CS5800HW3.Decorator;

public class Order 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello, what would you like to order?\n1. Burger\n2. Fries\n3. Drink");
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem drink = new Drink();

        burger = new Tomatoes(burger);
        burger = new Lettuce(burger);
        fries = new Cheese(fries);
        drink = new Ice(drink);

        TotalCost totalCost = new TotalCost();
        totalCost.addFood(burger);
        totalCost.addFood(drink);
        totalCost.addFood(fries);

        double cost = totalCost.totalCost();
        Discounts discounts = new Discounts(80);
        cost = discounts.applyDiscount(cost);

        System.out.println("Total cost with discount: $" + cost);
    }
}
