package net.PugGam3erp.decormod.entity.client;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.GreenSnakeEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class GreenSnakeModel extends AnimatedGeoModel<GreenSnakeEntity> {
    @Override
    public Identifier getModelResource(GreenSnakeEntity object) {
        return new Identifier(DecorMod.MOD_ID, "geo/green_snake.geo.json");
    }

    @Override
    public Identifier getTextureResource(GreenSnakeEntity object) {
        return new Identifier(DecorMod.MOD_ID, "textures/entity/snakes/green_snake.png");
    }

    @Override
    public Identifier getAnimationResource(GreenSnakeEntity animatable) {
        return new Identifier(DecorMod.MOD_ID, "animations/green_snake.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(GreenSnakeEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}