package CS5800HW3.Decorator;

public class Cheese extends FoodDecorator
{
    private double cost;

    public Cheese(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.25;
    }

    public double cost()
    {
        return super.cost() + cost;
    }
}
