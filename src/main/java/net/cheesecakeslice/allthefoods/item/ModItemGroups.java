package net.cheesecakeslice.allthefoods.item;

import net.cheesecakeslice.allthefoods.AllTheFoods;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ATF_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AllTheFoods.MOD_ID, "allthefoods"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ATF"))
                    .icon(() -> new ItemStack(ModItems.TOAST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TOAST);
                        entries.add(ModItems.DRIEDSWEETBERRIES);
                    }).build());
    public static void registerItemGroups(){
        AllTheFoods.LOGGER.info("Registering Item Group for " + AllTheFoods.MOD_ID);
    }
}
