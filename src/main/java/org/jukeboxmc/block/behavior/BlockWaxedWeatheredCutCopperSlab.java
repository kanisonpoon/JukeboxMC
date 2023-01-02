package org.jukeboxmc.block.behavior;

import com.nukkitx.nbt.NbtMap;
import org.jukeboxmc.block.Block;
import org.jukeboxmc.block.BlockType;
import org.jukeboxmc.block.direction.BlockFace;
import org.jukeboxmc.item.Item;
import org.jukeboxmc.math.Vector;
import org.jukeboxmc.player.Player;
import org.jukeboxmc.util.Identifier;
import org.jukeboxmc.world.World;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class BlockWaxedWeatheredCutCopperSlab extends BlockSlab {

    public BlockWaxedWeatheredCutCopperSlab( Identifier identifier ) {
        super( identifier );
    }

    public BlockWaxedWeatheredCutCopperSlab( Identifier identifier, NbtMap blockStates ) {
        super( identifier, blockStates );
    }

    @Override
    public boolean placeBlock( Player player, World world, Vector blockPosition, Vector placePosition, Vector clickedPosition, Item itemInHand, BlockFace blockFace ) {
        Block targetBlock = world.getBlock( blockPosition );
        Block block = world.getBlock( placePosition );

        if ( blockFace == BlockFace.DOWN ) {
            if ( targetBlock instanceof BlockWaxedWeatheredCutCopperSlab blockSlab ) {
                if ( blockSlab.isTopSlot() ) {
                    world.setBlock( blockPosition, Block.create( BlockType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB ) );
                    return true;
                }
            } else if ( block instanceof BlockWaxedWeatheredCutCopperSlab ) {
                world.setBlock( placePosition, Block.create( BlockType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB ) );
                return true;
            }
        } else if ( blockFace == BlockFace.UP ) {
            if ( targetBlock instanceof BlockWaxedWeatheredCutCopperSlab blockSlab ) {
                if ( !blockSlab.isTopSlot() ) {
                    world.setBlock( blockPosition, Block.create( BlockType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB ) );
                    return true;
                }
            } else if ( block instanceof BlockWaxedWeatheredCutCopperSlab ) {
                world.setBlock( placePosition, Block.create( BlockType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB ) );
                return true;
            }
        } else {
            if ( block instanceof BlockWaxedWeatheredCutCopperSlab ) {
                world.setBlock( placePosition, Block.create( BlockType.WAXED_WEATHERED_DOUBLE_CUT_COPPER_SLAB ) );
                return true;
            }
        }
        super.placeBlock( player, world, blockPosition, placePosition, clickedPosition, itemInHand, blockFace );
        world.setBlock( placePosition, this );
        return true;
    }
}