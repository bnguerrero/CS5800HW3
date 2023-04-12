package CS5800HW3.Decorator;

public class Ice extends FoodDecorator
{
    private double cost;

    public Ice(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.05;
    }
    
    public double cost()
    {
        return super.cost() + cost;
    }
}
