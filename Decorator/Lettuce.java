package CS5800HW3.Decorator;

public class Lettuce extends FoodDecorator
{
    private double cost;

    public Lettuce(FoodItem decoratedFood) {
        super(decoratedFood);
        cost = 0.30;
    }
    
    public double cost()
    {
        System.out.println("extra lettuce: $" + cost);
        return super.cost() + cost;
    }
}
