package org.jukeboxmc.item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemDoubleRedSandstoneSlab extends Item {

    public ItemDoubleRedSandstoneSlab() {
        super( "minecraft:double_stone_slab2", 182 );
    }

    public void setSlabType( SlabType slabType ) {
        this.setMeta( slabType.ordinal() );
    }

    public SlabType getSlabType() {
        return SlabType.values()[this.getMeta()];
    }

    public enum SlabType {
        RED_SANDSTONE,
        PURPUR,
        PRISMARINE,
        DARK_PRISMARINE,
        PRISMARINE_BRICKS,
        MOSSY_COBBLESTONE,
        SMOOTH_SANDSTONE,
        RED_NETHER_BRICK
    }
}
