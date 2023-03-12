package mystery.mbase;

import mystery.mbase.block.ModBlocks;
import mystery.mbase.item.ModItems;
import net.fabricmc.api.ModInitializer;

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


		LOGGER.info("Hello Fabric world!");
	}
}