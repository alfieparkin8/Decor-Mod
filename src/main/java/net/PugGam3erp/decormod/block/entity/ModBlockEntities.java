package net.PugGam3erp.decormod.block.entity;


import net.PugGam3erp.decormod.DecorMod;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<FletchingTableBlockEntity> FLETCHING_TABLE;

    public static void registerAllBlockEntities(){
        FLETCHING_TABLE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(DecorMod.MOD_ID, "fletching_table"),
                FabricBlockEntityTypeBuilder.create(FletchingTableBlockEntity::new, Blocks.FLETCHING_TABLE).build(null));
    }
}
