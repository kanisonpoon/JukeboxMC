package org.jukeboxmc.item.behavior;

import org.jukeboxmc.entity.attribute.Attribute;
import org.jukeboxmc.entity.attribute.AttributeType;
import org.jukeboxmc.item.*;
import org.jukeboxmc.player.Player;
import org.jukeboxmc.util.Identifier;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class ItemIronAxe extends Item implements Durability {

    public ItemIronAxe( Identifier identifier ) {
        super( identifier );
    }

    public ItemIronAxe( ItemType itemType ) {
        super( itemType );
    }

    @Override
    public void addToHand( Player player ) {
        Attribute attribute = player.getAttribute( AttributeType.ATTACK_DAMAGE );
        attribute.setCurrentValue( 5 );
    }

    @Override
    public void removeFromHand( Player player ) {
        Attribute attribute = player.getAttribute( AttributeType.ATTACK_DAMAGE );
        attribute.setCurrentValue( attribute.getMinValue() );
    }

    @Override
    public int getMaxDurability() {
        return 250;
    }

    @Override
    public ToolType getToolType() {
        return ToolType.AXE;
    }

    @Override
    public TierType getTierType() {
        return TierType.IRON;
    }
}