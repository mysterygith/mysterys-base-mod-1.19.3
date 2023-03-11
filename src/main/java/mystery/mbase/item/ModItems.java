package mystery.mbase.item;

import mystery.mbase.MBase;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings()));

    public static final Item PIG_IRON = registerItem("pig_iron",
            new Item(new FabricItemSettings()));

    public static final Item BANANA_BREAD = registerItem("banana_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA_BREAD)));

    public static final Item BANANA = registerItem("banana",
            new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MBase.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, STEEL_INGOT);
        addToItemGroup(ItemGroups.INGREDIENTS, PIG_IRON);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, BANANA);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, BANANA_BREAD);




    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        MBase.LOGGER.info("Registering Mod Items for " + MBase.MOD_ID);

        addItemsToItemGroup();
    }
}
