package net.cheesecakeslice.allthefoods.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DRIEDSWEETBERRIES = new FoodComponent.Builder().hunger(3).saturationModifier(2f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build();
    public static final FoodComponent BORSCHT = new FoodComponent.Builder().hunger(10).saturationModifier(2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1000),100f).build();
}
