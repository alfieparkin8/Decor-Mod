package net.PugGam3erp.decormod.world.feature;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> CHERRY_BLOSSOM_TREE =
            ConfiguredFeatures.register("cherry_blossom_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LOG),
                    new StraightTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.CHERRY_BLOSSOM_LEAVES),
                    new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                    new TwoLayersFeatureSize(1, 0, 2)).build());

    public static final RegistryEntry<PlacedFeature> CHERRY_BLOSSOM_CHECKED =
            PlacedFeatures.register("cherry_blossom_checked", CHERRY_BLOSSOM_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.CHERRY_BLOSSOM_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> CHERRY_BLOSSOM_SPAWN =
            ConfiguredFeatures.register("cherry_blossom_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(CHERRY_BLOSSOM_CHECKED, 0.5f)),
                            CHERRY_BLOSSOM_CHECKED));


    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + DecorMod.MOD_ID);
    }
}
