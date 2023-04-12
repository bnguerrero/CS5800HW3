package CS5800HW3.Decorator;

public class Meat extends FoodDecorator
{
    private double cost;

    public Meat(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.85;
    }
    
    public double cost()
    {
        return super.cost() + cost;
    }
}
