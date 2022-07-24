package net.PugGam3erp.decormod.entity.client;

import net.PugGam3erp.decormod.DecorMod;
import net.PugGam3erp.decormod.entity.custom.GreenSnakeEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GreenSnakeRenderer extends GeoEntityRenderer<GreenSnakeEntity> {
    public GreenSnakeRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GreenSnakeModel());
    }

    @Override
    public Identifier getTextureResource(GreenSnakeEntity instance) {
        return new Identifier(DecorMod.MOD_ID, "textures/entity/snakes/green_snake.png");
    }
}