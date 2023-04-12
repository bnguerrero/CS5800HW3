package CS5800HW3.Decorator;

public class Discounts 
{
    private int discounts;

    public Discounts(int discounts)
    {
        this.discounts = discounts;
    }

    public double applyDiscount(double cost)
    {
        if (discounts == 200)
        {
            cost = cost -(cost*.20);
        }
        else if (discounts == 400)
        {
            cost = cost -(cost*.40);
        }
        else if (discounts == 600)
        {
            cost = cost -(cost*.60);
        }
        else if (discounts == 800)
        {
            cost = cost -(cost*.80);
        }
        return cost;
    }
}
