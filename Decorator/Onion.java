package CS5800HW3.Decorator;

public class Onion extends FoodDecorator
{
    private double cost;

    public Onion(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.10;
    }
    
    public double cost()
    {
        System.out.println("extra onions: $" + cost);
        return super.cost() + cost;
    }
}
