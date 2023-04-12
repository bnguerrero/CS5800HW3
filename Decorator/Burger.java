package CS5800HW3.Decorator;

public class Burger implements FoodItem
{
    private double basePrice = 1.50;

    @Override
    public double cost() 
    {
        return basePrice; 
    }
    
}
