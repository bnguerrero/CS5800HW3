package CS5800HW3.Decorator;

public abstract class FoodDecorator implements FoodItem
{
    protected FoodItem decoratedFood;

    public FoodDecorator(FoodItem decoratedFood)
    {
        this.decoratedFood = decoratedFood;
    }

    public double cost()
    {
        return decoratedFood.cost();
    }

}
