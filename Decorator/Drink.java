package CS5800HW3.Decorator;

public class Drink implements FoodItem
{
    private double basePrice = 0.75;

    @Override
    public double cost() 
    {
        return basePrice; 
    }
}
