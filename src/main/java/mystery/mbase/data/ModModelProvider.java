package mystery.mbase.data;

import mystery.mbase.block.ModBlocks;
import mystery.mbase.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    // Block Model Generator
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.STEEL_BLOCK);

    }

    @Override
    // Item Model Generator
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.BANANA, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PIG_IRON, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINEAPPLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BANANA_BREAD, Models.GENERATED);

    }
}
