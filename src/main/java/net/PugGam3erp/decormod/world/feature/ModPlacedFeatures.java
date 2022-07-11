package net.PugGam3erp.decormod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> CHERRY_BLOSSOM_PLACED = PlacedFeatures.register("cherry_blossom_placed",
            ModConfiguredFeatures.CHERRY_BLOSSOM_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> SAPPHIRE_ORE_PLACED = PlacedFeatures.register("sapphire_ore_placed",
            ModConfiguredFeatures.SAPPHIRE_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

}