package mystery.mbase.block;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.BLUE_MAHOE_LEAVES, 30, 60);
        registry.add(ModBlocks.BLUE_MAHOE_LOG, 5, 5);
        registry.add(ModBlocks.BLUE_MAHOE_WOOD, 5, 5);
        registry.add(ModBlocks.BLUE_MAHOE_PLANKS, 5, 20);
        registry.add(ModBlocks.STRIPPED_BLUE_MAHOE_LOG, 5, 5);
        registry.add(ModBlocks.STRIPPED_BLUE_MAHOE_WOOD, 5, 5);
    }
}
