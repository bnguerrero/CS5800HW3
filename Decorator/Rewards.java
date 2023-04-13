package CS5800HW3.Decorator;

public class Rewards 
{
    private int discounts;

    public Rewards(int discounts)
    {
        this.discounts = discounts;
    }

    public double Discount(double cost)
    {
        if (discounts == 200)
        {
            System.out.println("200 rewards points ~ 20% off : - $" + Math.round((cost*.20)*100.0)/100.0);
            cost = Math.round((cost -(cost*.20))*100.0)/100.0;
        }
        else if (discounts == 400)
        {
            System.out.println("400 rewards points ~ 40% off : - $" + Math.round((cost*.40)*100.0)/100.0);
            cost = Math.round((cost -(cost*.40))*100.0)/100.0;

        }
        else if (discounts == 600)
        {
            System.out.println("600 rewards points ~ 60% off : - $" + Math.round((cost*.60)*100.0)/100.0);
            cost = Math.round((cost -(cost*.60))*100.0)/100.0;
        }
        else if (discounts == 800)
        {
            System.out.println("800 rewards points ~ 80% off : - $" + Math.round((cost*.80)*100.0)/100.0);
            cost = Math.round((cost -(cost*.80))*100.0)/100.0;
        }
        return cost;
    }
}
