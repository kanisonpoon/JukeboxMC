package org.jukeboxmc.item;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemBanner extends Item {

    public ItemBanner() {
        super( "minecraft:banner", 557 );
    }

    public void setColor( BannerColor bannerColor ) {
        this.setMeta( bannerColor.ordinal() );
    }

    public BannerColor getColor() {
        return BannerColor.values()[this.getMeta()];
    }

    public enum BannerColor {
        BLACK,
        RED,
        GREEN,
        BROWN,
        BLUE,
        PURPLE,
        CYAN,
        SILVER,
        GRAY,
        PINK,
        LIME,
        YELLOW,
        LIGHT_BLUE,
        MAGENTA,
        ORANGE,
        WHITE
    }
}
