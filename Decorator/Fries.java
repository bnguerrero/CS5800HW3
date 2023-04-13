package CS5800HW3.Decorator;
public class Fries implements FoodItem
{
    private double basePrice = 0.95;
    
    @Override
    public double cost() {
        System.out.println("fries: $" + basePrice);
        return basePrice;
    }
    
}
