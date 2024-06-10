package net.cheesecakeslice.allthefoods.compat;

import squeek.appleskin.api.AppleSkinApi;
import squeek.appleskin.api.event.FoodValuesEvent;
import squeek.appleskin.api.food.FoodValues;

public class AppleSkinEventHandler implements AppleSkinApi {
    @Override
    public void registerEvents() {
        FoodValuesEvent.EVENT.register(foodValuesEvent -> {
            foodValuesEvent.modifiedFoodValues = new FoodValues(foodValuesEvent.defaultFoodValues.hunger, foodValuesEvent.defaultFoodValues.saturationModifier);
        });
    }
}
