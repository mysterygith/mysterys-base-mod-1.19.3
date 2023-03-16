package mystery.mbase.block;

import mystery.mbase.MBase;
import mystery.mbase.world.tree.BlueMahoeSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;



public class ModBlocks {
    // Blocks
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    public static final Block BLUE_MAHOE_LOG = registerBlock("blue_mahoe_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block BLUE_MAHOE_WOOD = registerBlock("blue_mahoe_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_BLUE_MAHOE_LOG = registerBlock("stripped_blue_mahoe_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block STRIPPED_BLUE_MAHOE_WOOD = registerBlock("stripped_blue_mahoe_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    public static final Block BLUE_MAHOE_PLANKS = registerBlock("blue_mahoe_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    public static final Block BLUE_MAHOE_LEAVES = registerBlock("blue_mahoe_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);

    public static final Block BLUE_MAHOE_SAPLING = registerBlock("blue_mahoe_sapling",
            new SaplingBlock(new BlueMahoeSaplingGenerator(), FabricBlockSettings.copyOf(Blocks.OAK_SAPLING).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MBase.MOD_ID, name), block);
    }


    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MBase.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }


    public static void registerModBlocks() {
        MBase.LOGGER.info("Registering ModBlocks for " + MBase.MOD_ID);
    }
}
