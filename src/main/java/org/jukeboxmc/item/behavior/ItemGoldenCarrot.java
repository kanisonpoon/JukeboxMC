package org.jukeboxmc.item.behavior;

import org.jukeboxmc.item.ItemType;
import org.jukeboxmc.util.Identifier;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemGoldenCarrot extends ItemFood {

    public ItemGoldenCarrot( Identifier identifier ) {
        super( identifier );
    }

    public ItemGoldenCarrot( ItemType itemType ) {
        super( itemType );
    }

    @Override
    public float getSaturation() {
        return 14.4f;
    }

    @Override
    public int getHunger() {
        return 6;
    }
}