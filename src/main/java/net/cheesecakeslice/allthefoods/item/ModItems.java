package net.cheesecakeslice.allthefoods.item;

import net.cheesecakeslice.allthefoods.AllTheFoods;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TOAST = registerItem("toast", new Item(new FabricItemSettings().food(ModFoodComponents.TOAST)));
    public static final  Item DRIEDSWEETBERRIES = registerItem("driedsweetberries", new Item(new FabricItemSettings().food(ModFoodComponents.DRIEDSWEETBERRIES)));
    public static final Item BORSCHT = registerItem("borscht", new Item(new FabricItemSettings().food(ModFoodComponents.BORSCHT).maxCount(8)));
    public static final Item SAUTEEDAPPLES = registerItem("sauteedapples", new Item(new FabricItemSettings().food(ModFoodComponents.SAUTEEDAPPLES).maxCount(16)));

    private static void addItemToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(TOAST);
        entries.add(DRIEDSWEETBERRIES);
        entries.add(BORSCHT);
        entries.add(SAUTEEDAPPLES);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(AllTheFoods.MOD_ID, name), item);
    }
    public static void registerModItems(){
        AllTheFoods.LOGGER.info("Registering Mod Items For " + AllTheFoods.MOD_ID );

        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemToIngredientItemGroup);
    }
}
