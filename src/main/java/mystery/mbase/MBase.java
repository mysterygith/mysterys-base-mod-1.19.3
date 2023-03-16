package mystery.mbase;

import mystery.mbase.block.ModBlocks;
import mystery.mbase.block.ModFlammableBlockRegistry;
import mystery.mbase.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MBase implements ModInitializer {
	public static final	String MOD_ID = "mbase";
	public static final Logger LOGGER = LoggerFactory.getLogger("mbase");

	@Override
	public void onInitialize() {
		// Initializing
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModFlammableBlockRegistry.registerFlammableBlocks();
		StrippableBlockRegistry.register(ModBlocks.BLUE_MAHOE_LOG, ModBlocks.STRIPPED_BLUE_MAHOE_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLUE_MAHOE_LOG, ModBlocks.STRIPPED_BLUE_MAHOE_LOG);

	}
}