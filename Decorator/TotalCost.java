package CS5800HW3.Decorator;

import java.util.ArrayList;
import java.util.List;

public class TotalCost 
{
    private List<FoodItem> foodItems;
    private double totalCost = 0.0;
    
    public TotalCost()
    {
        foodItems = new ArrayList<>();
    }

    public void addFood(FoodItem foodItem)
    {
        foodItems.add(foodItem);
    }

    public double totalCost()
    {
        for(FoodItem foodItem: foodItems)
        {
            totalCost += foodItem.cost();
        }
        return totalCost;
    }
}
