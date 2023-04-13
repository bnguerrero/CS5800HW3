package CS5800HW3.Decorator;

public class Order 
{
    public static void main(String[] args) 
    {   
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();
        FoodItem drink = new Drink();

        
        burger = new Tomatoes(burger);
        burger = new Lettuce(burger);
        burger = new Pickles(burger);
        burger = new Onion(burger);
        burger = new Cheese(burger);
        fries = new Cheese(fries);
        fries = new Onion(fries);
        fries = new Meat(fries);
        

        TotalCost totalCost = new TotalCost();
        totalCost.addFood(burger);
        totalCost.addFood(drink);
        totalCost.addFood(fries);

        double cost = totalCost.totalCost();
        Rewards discounts = new Rewards(200);
        cost = discounts.Discount(cost);

        System.out.println("Total: $" + cost);
    }
}
