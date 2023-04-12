package CS5800HW3.Decorator;

public class Pickles extends FoodDecorator
{
    private double cost;

    public Pickles(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.35;
    }
    
    public double cost()
    {
        return super.cost() + cost;
    }
}
