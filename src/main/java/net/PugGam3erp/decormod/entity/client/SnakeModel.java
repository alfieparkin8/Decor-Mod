package net.PugGam3erp.decormod.entity.client;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.SnakeEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class SnakeModel extends AnimatedGeoModel<SnakeEntity> {
    @Override
    public Identifier getModelResource(SnakeEntity object) {
        return new Identifier(DecorMod.MOD_ID, "geo/snake.geo.json");
    }

    @Override
    public Identifier getTextureResource(SnakeEntity object) {
        return SnakeRenderer.LOCATION_BY_VARIANT.get(object.getVariant());
    }

    @Override
    public Identifier getAnimationResource(SnakeEntity animatable) {
        return new Identifier(DecorMod.MOD_ID, "animations/snake.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(SnakeEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}