package net.PugGam3erp.decormod.entity.client;

import com.google.common.collect.Maps;
import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.SnakeEntity;
import net.PugGam3erp.decormod.entity.variant.SnakeVariant;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SnakeRenderer extends GeoEntityRenderer<SnakeEntity> {
    public SnakeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SnakeModel());
    }

    public static final Map<SnakeVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(SnakeVariant.class), (map) -> {
                map.put(SnakeVariant.DEFAULT,
                        new Identifier(DecorMod.MOD_ID, "textures/entity/snakes/green_snake.png"));
                map.put(SnakeVariant.RED,
                        new Identifier(DecorMod.MOD_ID, "textures/entity/snakes/red_snake.png"));
                map.put(SnakeVariant.BLACK,
                        new Identifier(DecorMod.MOD_ID, "textures/entity/snakes/black_snake.png"));
            });

    @Override
    public Identifier getTextureResource(SnakeEntity instance) {
        return LOCATION_BY_VARIANT.get(instance.getVariant());
    }

    @Override
    public RenderLayer getRenderType(SnakeEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.5f, 0.5f, 0.5f);
        } else {
            stack.scale(1f, 1f, 1f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder,
                packedLightIn, textureLocation);
    }
}