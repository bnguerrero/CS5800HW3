package CS5800HW3.Decorator;

public class Tomatoes extends FoodDecorator
{
    private double cost;

    public Tomatoes(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.20;
    }
    
    public double cost()
    {
        return super.cost() + cost;
    }
}
