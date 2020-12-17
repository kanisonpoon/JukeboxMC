package org.jukeboxmc.network.packet;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jukeboxmc.network.Protocol;

/**
 * @author LucGamesYT
 * @version 1.0
 */
@Data
@EqualsAndHashCode( callSuper =  true )
public class InteractPacket extends Packet {

    private Action action;
    private long target;

    @Override
    public int getPacketId() {
        return Protocol.INTERACT_PACKET;
    }

    @Override
    public void read() {
        super.read();
        this.action = Action.values()[this.readByte() + 1];
        this.target = this.readUnsignedVarLong();
    }

    public enum Action {
        INTERACT,
        ATTACK,
        LEAVE_VEHICLE,
        MOUSEOVER,
        OPEN_NPC,
        OPEN_INVENTORY
    }
}
