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
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block CHERRY_BLOSSOM_PLANKS = registerBlock("cherry_blossom_planks", new Block(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_BUTTON = registerBlock("cherry_blossom_button", new ModWoodenButtonBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD).noCollision()), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_PRESSURE_PLATE = registerBlock("cherry_blossom_pressure_plate", new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_FENCE = registerBlock("cherry_blossom_fence", new FenceBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_FENCE_GATE = registerBlock("cherry_blossom_fence_gate", new FenceGateBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_SLAB = registerBlock("cherry_blossom_slab", new SlabBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_STAIRS = registerBlock("cherry_blossom_stairs", new ModStairsBlock(ModBlocks.CHERRY_BLOSSOM_PLANKS.getDefaultState(),AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_DOOR = registerBlock("cherry_blossom_door", new ModDoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_TRAPDOOR = registerBlock("cherry_blossom_trapdoor", new ModTrapdoorBlock(AbstractBlock.Settings.of(Material.WOOD, MapColor.OAK_TAN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_LOG = registerBlock("cherry_blossom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(4.0f)),ModItemGroup.DECOR);
    public static final Block CHERRY_BLOSSOM_WOOD = registerBlock("cherry_blossom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(4.0f)),ModItemGroup.DECOR);
    public static final Block STRIPPED_CHERRY_BLOSSOM_LOG = registerBlock("stripped_cherry_blossom_log", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(4.0f)),ModItemGroup.DECOR);
    public static final Block STRIPPED_CHERRY_BLOSSOM_WOOD = registerBlock("stripped_cherry_blossom_wood", new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(4.0f)),ModItemGroup.DECOR);

    public static final Block CHERRY_BLOSSOM_LEAVES = registerBlock("cherry_blossom_leaves", new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).strength(4.0f).nonOpaque()),ModItemGroup.DECOR);

    public static final Block CHERRY_BLOSSOM_SAPLING = registerBlock("cherry_blossom_sapling", new ModSaplingBlock(new CherryBlossomSaplingGenerator(), FabricBlockSettings.copy(Blocks.OAK_SAPLING)),ModItemGroup.DECOR);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
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
