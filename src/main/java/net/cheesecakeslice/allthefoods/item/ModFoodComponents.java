package net.cheesecakeslice.allthefoods.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent DRIEDSWEETBERRIES = new FoodComponent.Builder().hunger(3).saturationModifier(1.6f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().hunger(6).saturationModifier(0.7f).build();
    public static final FoodComponent BORSCHT = new FoodComponent.Builder().hunger(10).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000),100f).build();
    public static final FoodComponent SAUTEEDAPPLES = new FoodComponent.Builder().hunger(3).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 800), 100f).build();
}
