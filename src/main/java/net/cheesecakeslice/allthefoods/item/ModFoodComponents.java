package net.cheesecakeslice.allthefoods.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DRIEDSWEETBERRIES = new FoodComponent.Builder().hunger(3).saturationModifier(1.5f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(6).saturationModifier(0.9f).build();
}
