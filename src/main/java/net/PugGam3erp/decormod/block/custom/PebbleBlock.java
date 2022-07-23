package net.PugGam3erp.decormod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class PebbleBlock extends Block {

    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public PebbleBlock(Settings settings) {
        super(settings);
    }

    private static final VoxelShape SHAPE_N = Stream.of(
            Block.createCuboidShape(2, 0, 1, 4, 0.25, 3),
            Block.createCuboidShape(11, 0, 1, 12, 0.25, 2),
            Block.createCuboidShape(14, 0, 3, 15, 0.25, 4),
            Block.createCuboidShape(12, 0, 13, 13, 0.25, 14),
            Block.createCuboidShape(14, 0, 14, 15, 0.25, 15),
            Block.createCuboidShape(6, 0, 14, 7, 0.25, 15),
            Block.createCuboidShape(7, 0, 9, 8, 0.25, 10),
            Block.createCuboidShape(5, 0, 3, 6, 0.25, 4),
            Block.createCuboidShape(9, 0, 5, 10, 0.25, 6),
            Block.createCuboidShape(10, 0, 8, 11, 0.25, 9),
            Block.createCuboidShape(1, 0, 10, 2, 0.25, 11),
            Block.createCuboidShape(2, 0, 4, 3, 0.25, 5),
            Block.createCuboidShape(1, 0, 6, 4, 0.25, 9),
            Block.createCuboidShape(7, 0, 1, 10, 0.25, 4),
            Block.createCuboidShape(8, 0, 11, 11, 0.25, 14),
            Block.createCuboidShape(1, 0, 12, 4, 0.25, 15),
            Block.createCuboidShape(13, 0, 7, 15, 0.25, 9),
            Block.createCuboidShape(2, 0, 1, 4, 0.25, 3),
            Block.createCuboidShape(12, 0, 10, 14, 0.25, 12),
            Block.createCuboidShape(6, 0, 6, 8, 0.25, 8),
            Block.createCuboidShape(5, 0, 11, 7, 0.25, 13),
            Block.createCuboidShape(11, 0, 4, 13, 0.25, 6)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.createCuboidShape(1.2272727272727257, 0, 12, 3, 0.25, 14),
            Block.createCuboidShape(1.2272727272727257, 0, 4, 2, 0.25, 5),
            Block.createCuboidShape(3.2272727272727257, 0, 1, 4, 0.25, 2),
            Block.createCuboidShape(13.227272727272727, 0, 3, 14, 0.25, 4),
            Block.createCuboidShape(14.227272727272727, 0, 1, 15, 0.25, 2),
            Block.createCuboidShape(14.227272727272727, 0, 9, 15, 0.25, 10),
            Block.createCuboidShape(9.227272727272727, 0, 8, 10, 0.25, 9),
            Block.createCuboidShape(3.2272727272727257, 0, 10, 4, 0.25, 11),
            Block.createCuboidShape(5.227272727272726, 0, 6, 6, 0.25, 7),
            Block.createCuboidShape(8.227272727272727, 0, 5, 9, 0.25, 6),
            Block.createCuboidShape(10.227272727272727, 0, 14, 11, 0.25, 15),
            Block.createCuboidShape(4.227272727272726, 0, 13, 5, 0.25, 14),
            Block.createCuboidShape(6.227272727272726, 0, 12, 9, 0.25, 15),
            Block.createCuboidShape(1.2272727272727257, 0, 6, 4, 0.25, 9),
            Block.createCuboidShape(11.227272727272727, 0, 5, 14, 0.25, 8),
            Block.createCuboidShape(12.227272727272727, 0, 12, 15, 0.25, 15),
            Block.createCuboidShape(7.227272727272726, 0, 1, 9, 0.25, 3),
            Block.createCuboidShape(1.2272727272727257, 0, 12, 3, 0.25, 14),
            Block.createCuboidShape(10.227272727272727, 0, 2, 12, 0.25, 4),
            Block.createCuboidShape(6.227272727272726, 0, 8, 8, 0.25, 10),
            Block.createCuboidShape(11.227272727272727, 0, 9, 13, 0.25, 11),
            Block.createCuboidShape(4.227272727272726, 0, 3, 6, 0.25, 5)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.createCuboidShape(12.136363636363637, 0, 12.681818181818183, 14.136363636363637, 0.25, 14.681818181818183),
            Block.createCuboidShape(4.136363636363636, 0, 13.681818181818183, 5.136363636363636, 0.25, 14.681818181818183),
            Block.createCuboidShape(1.1363636363636358, 0, 11.681818181818183, 2.136363636363636, 0.25, 12.681818181818183),
            Block.createCuboidShape(3.136363636363636, 0, 1.6818181818181817, 4.136363636363636, 0.25, 2.6818181818181817),
            Block.createCuboidShape(1.1363636363636358, 0, 0.6818181818181817, 2.136363636363636, 0.25, 1.6818181818181817),
            Block.createCuboidShape(9.136363636363637, 0, 0.6818181818181817, 10.136363636363637, 0.25, 1.6818181818181817),
            Block.createCuboidShape(8.136363636363637, 0, 5.681818181818182, 9.136363636363637, 0.25, 6.681818181818182),
            Block.createCuboidShape(10.136363636363637, 0, 11.681818181818183, 11.136363636363637, 0.25, 12.681818181818183),
            Block.createCuboidShape(6.136363636363636, 0, 9.681818181818183, 7.136363636363636, 0.25, 10.681818181818183),
            Block.createCuboidShape(5.136363636363636, 0, 6.681818181818182, 6.136363636363636, 0.25, 7.6818181818181825),
            Block.createCuboidShape(14.136363636363637, 0, 4.681818181818182, 15.136363636363637, 0.25, 5.681818181818182),
            Block.createCuboidShape(13.136363636363637, 0, 10.681818181818183, 14.136363636363637, 0.25, 11.681818181818183),
            Block.createCuboidShape(12.136363636363637, 0, 6.681818181818182, 15.136363636363637, 0.25, 9.681818181818183),
            Block.createCuboidShape(6.136363636363636, 0, 11.681818181818183, 9.136363636363637, 0.25, 14.681818181818183),
            Block.createCuboidShape(5.136363636363636, 0, 1.6818181818181817, 8.136363636363637, 0.25, 4.681818181818182),
            Block.createCuboidShape(12.136363636363637, 0, 0.6818181818181817, 15.136363636363637, 0.25, 3.6818181818181817),
            Block.createCuboidShape(1.1363636363636358, 0, 6.681818181818182, 3.136363636363636, 0.25, 8.681818181818183),
            Block.createCuboidShape(12.136363636363637, 0, 12.681818181818183, 14.136363636363637, 0.25, 14.681818181818183),
            Block.createCuboidShape(2.136363636363636, 0, 3.6818181818181817, 4.136363636363636, 0.25, 5.681818181818182),
            Block.createCuboidShape(8.136363636363637, 0, 7.6818181818181825, 10.136363636363637, 0.25, 9.681818181818183),
            Block.createCuboidShape(9.136363636363637, 0, 2.6818181818181817, 11.136363636363637, 0.25, 4.681818181818182),
            Block.createCuboidShape(3.136363636363636, 0, 9.681818181818183, 5.136363636363636, 0.25, 11.681818181818183)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.createCuboidShape(12.90909090909091, 0, 1.7727272727272716, 14.90909090909091, 0.25, 3.7727272727272716),
            Block.createCuboidShape(13.90909090909091, 0, 10.772727272727273, 14.90909090909091, 0.25, 11.772727272727273),
            Block.createCuboidShape(11.90909090909091, 0, 13.772727272727273, 12.90909090909091, 0.25, 14.772727272727273),
            Block.createCuboidShape(1.9090909090909092, 0, 11.772727272727273, 2.909090909090909, 0.25, 12.772727272727273),
            Block.createCuboidShape(0.9090909090909092, 0, 13.772727272727273, 1.9090909090909092, 0.25, 14.772727272727273),
            Block.createCuboidShape(0.9090909090909092, 0, 5.772727272727272, 1.9090909090909092, 0.25, 6.772727272727272),
            Block.createCuboidShape(5.909090909090909, 0, 6.772727272727272, 6.909090909090909, 0.25, 7.7727272727272725),
            Block.createCuboidShape(11.90909090909091, 0, 4.772727272727272, 12.90909090909091, 0.25, 5.772727272727272),
            Block.createCuboidShape(9.90909090909091, 0, 8.772727272727273, 10.90909090909091, 0.25, 9.772727272727273),
            Block.createCuboidShape(6.909090909090909, 0, 9.772727272727273, 7.90909090909091, 0.25, 10.772727272727273),
            Block.createCuboidShape(4.909090909090909, 0, 0.7727272727272716, 5.909090909090909, 0.25, 1.7727272727272716),
            Block.createCuboidShape(10.90909090909091, 0, 1.7727272727272716, 11.90909090909091, 0.25, 2.7727272727272716),
            Block.createCuboidShape(6.909090909090909, 0, 0.7727272727272716, 9.90909090909091, 0.25, 3.7727272727272716),
            Block.createCuboidShape(11.90909090909091, 0, 6.772727272727272, 14.90909090909091, 0.25, 9.772727272727273),
            Block.createCuboidShape(1.9090909090909092, 0, 7.7727272727272725, 4.909090909090909, 0.25, 10.772727272727273),
            Block.createCuboidShape(0.9090909090909092, 0, 0.7727272727272716, 3.909090909090909, 0.25, 3.7727272727272716),
            Block.createCuboidShape(6.909090909090909, 0, 12.772727272727273, 8.90909090909091, 0.25, 14.772727272727273),
            Block.createCuboidShape(12.90909090909091, 0, 1.7727272727272716, 14.90909090909091, 0.25, 3.7727272727272716),
            Block.createCuboidShape(3.909090909090909, 0, 11.772727272727273, 5.909090909090909, 0.25, 13.772727272727273),
            Block.createCuboidShape(7.90909090909091, 0, 5.772727272727272, 9.90909090909091, 0.25, 7.7727272727272725),
            Block.createCuboidShape(2.909090909090909, 0, 4.772727272727272, 4.909090909090909, 0.25, 6.772727272727272),
            Block.createCuboidShape(9.90909090909091, 0, 10.772727272727273, 11.90909090909091, 0.25, 12.772727272727273)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
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
}
