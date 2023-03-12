package mystery.mbase.data;

import mystery.mbase.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    // Loot Table Generator
    public void generate() {
        addDrop(ModBlocks.STEEL_BLOCK);
    }
}
