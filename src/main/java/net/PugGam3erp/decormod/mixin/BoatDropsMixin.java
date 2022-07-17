package net.PugGam3erp.decormod.mixin;

import net.PugGam3erp.decormod.item.ModItems;
import net.PugGam3erp.decormod.util.CustomBoatType;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BoatEntity.class)
public class BoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getBoatType() == CustomBoatType.CHERRY_BLOSSOM) {
            ci.setReturnValue(ModItems.CHERRY_BLOSSOM_BOAT);
        }
    }
}
