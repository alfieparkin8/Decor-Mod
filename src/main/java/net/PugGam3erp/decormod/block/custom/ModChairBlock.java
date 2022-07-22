package net.PugGam3erp.decormod.block.custom;

import net.PugGam3erp.decormod.sitOnStuff.SitEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static net.PugGam3erp.decormod.sitOnStuff.SitEntity.OCCUPIED;

public class ModChairBlock extends Block {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public ModChairBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE = Stream.of(
            Block.createCuboidShape(0, 0, 0, 1, 7, 1),
            Block.createCuboidShape(15, 0, 0, 16, 7, 1),
            Block.createCuboidShape(0, 0, 15, 1, 7, 16),
            Block.createCuboidShape(15, 0, 15, 16, 7, 16),
            Block.createCuboidShape(0, 7, 0, 16, 9, 16),
            Block.createCuboidShape(0, 9, 14, 16, 24, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {

        double x = pos.getX();
        double y = pos.getY();
        double z = pos.getZ();

        List<SitEntity> entities = world.getEntitiesByClass(SitEntity.class, new Box(x, y, z, x+1, y+1, z+1), new Predicate<SitEntity>() {
            @Override
            public boolean test(SitEntity entity) {
                return entity.hasPassengers();
            }
        });
        for (SitEntity entity : entities) {
            entity.remove(Entity.RemovalReason.DISCARDED);
        }

        // BREAK SOUND AND PARTICLES
        this.spawnBreakParticles(world, player, pos, state);
        world.emitGameEvent((Entity)player, GameEvent.BLOCK_DESTROY, pos);

        OCCUPIED.remove(new Vec3d(x, y, z));
    }



}
