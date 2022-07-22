package net.PugGam3erp.decormod.block;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocksTags {
    public static final TagKey<Block> CHAIRS = TagKey.of(Registry.BLOCK_KEY, new Identifier("decormod", "chairs"));
}
