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
        fries = new Cheese(fries);
        

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
