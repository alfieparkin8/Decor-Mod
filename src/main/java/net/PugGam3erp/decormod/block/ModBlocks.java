package net.PugGam3erp.decormod.block;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.block.custom.*;
import net.PugGam3erp.decormod.item.ModItemGroup;
import net.PugGam3erp.decormod.world.feature.tree.CherryBlossomSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CHERRY_BLOSSOM_PLANKS = registerBlock("cherry_blossom_planks", new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_BUTTON = registerBlock("cherry_blossom_button", new ModWoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).noCollision()), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_PRESSURE_PLATE = registerBlock("cherry_blossom_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_FENCE = registerBlock("cherry_blossom_fence", new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_FENCE_GATE = registerBlock("cherry_blossom_fence_gate", new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_SLAB = registerBlock("cherry_blossom_slab", new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_STAIRS = registerBlock("cherry_blossom_stairs", new ModStairsBlock(ModBlocks.CHERRY_BLOSSOM_PLANKS.getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door", new ModDoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor", new ModTrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_LOG = registerBlock("cherry_blossom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)),ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_WOOD = registerBlock("cherry_blossom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)),ModItemGroup.DECOR);
    public static final Block STRIPPED_CHERRY_BLOSSOM_LOG = registerBlock("stripped_cherry_blossom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)),ModItemGroup.DECOR);
    public static final Block STRIPPED_CHERRY_BLOSSOM_WOOD = registerBlock("stripped_cherry_blossom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)),ModItemGroup.DECOR);

    public static final Block CHERRY_BLOSSOM_LEAVES = registerBlock("cherry_blossom_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()),ModItemGroup.DECOR);

    public static final Block CHERRY_BLOSSOM_SAPLING = registerBlock("cherry_blossom_sapling", new ModSaplingBlock(new CherryBlossomSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING).noCollision()),ModItemGroup.DECOR);

    public static final Block POTTED_CHERRY_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_cherry_blossom_sapling", new FlowerPotBlock(ModBlocks.CHERRY_BLOSSOM_SAPLING, FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING)), ModItemGroup.DECOR);

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore", new OreBlock(FabricBlockSettings.copy(Blocks.DIAMOND_ORE)), ModItemGroup.DECOR);

    public static final Block OAK_TABLE = registerBlock("oak_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block BIRCH_TABLE = registerBlock("birch_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block SPRUCE_TABLE = registerBlock("spruce_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block DARK_OAK_TABLE = registerBlock("dark_oak_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block JUNGLE_TABLE = registerBlock("jungle_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block ACACIA_TABLE = registerBlock("acacia_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block CRIMSON_TABLE = registerBlock("crimson_table", new ModTableBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block WARPED_TABLE = registerBlock("warped_table", new ModTableBlock(FabricBlockSettings.of(Material.NETHER_WOOD).nonOpaque()), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_TABLE = registerBlock("cherry_blossom_table", new ModTableBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()), ModItemGroup.DECOR);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(DecorMod.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(DecorMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(DecorMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        DecorMod.LOGGER.info("Registering ModBlocks for " + DecorMod.MOD_ID);
    }
}
