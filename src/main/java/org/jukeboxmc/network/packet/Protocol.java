package org.jukeboxmc.network.packet;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public interface Protocol {

    int CURRENT_PROTOCOL = 448;
    String MINECRAFT_VERSION = "1.17.10";

    int BATCH_PACKET = 0xfe;
    byte LOGIN_PACKET = 0x01;
    byte PLAY_STATUS_PACKET = 0x02;
    byte DISCONNECT_PACKET = 0x05;
    byte RESOURCE_PACKS_INFO_PACKET = 0x06;
    byte RESOURCE_PACK_STACK_PACKET = 0x07;
    int CLIENT_CACHE_STATUS_PACKET = 0x81;
    byte RESOURCE_PACK_RESPONSE_PACKET = 0x08;
    byte RESOURCE_PACK_DATA_INFO_PACKET = 0x52;
    byte START_GAME_PACKET = 0x0b;
    byte LEVEL_CHUNK_PACKET = 0x3a;
    byte SET_DIFFICULTY_PACKET = 0x3c;
    byte UPDATE_BLOCK_PACKET = 0x15;
    byte BLOCK_ENTITY_DATA_PACKET = 0x38;
    byte ENTITY_VELOCITY_PACKET = 0x28;
    byte LEVEL_EVENT_PACKET = 0x19;
    byte LEVEL_SOUND_EVENT_PACKET = 0x7b;
    byte INVENTORY_SLOT_PACKET = 0x32;
    byte INVENTORY_CONTENT_PACKET = 0x31;
    byte MOB_EQUIPMENT_PACKET = 0x1f;
    byte CONTAINER_OPEN_PACKET = 0x2e;
    byte CONTAINER_CLOSE_PACKET = 0x2f;
    byte SET_GAMEMODE_PACKET = 0x3e;
    int CREATIVE_CONTENT_PACKET = 0x91;
    byte REQUEST_CHUNK_RADIUS_PACKET = 0x45;
    byte TICK_SYNC_PACKET = 0x17;
    byte CHUNK_RADIUS_UPDATE_PACKET = 0x46;
    byte ADVENTURER_SETTINGS_PACKET = 0x37;
    byte SET_ENTITY_DATA_PACKET = 0x27;
    byte AVAILABLE_ENTITY_IDENTIFIERS_PACKET = 0x77;
    byte BIOME_DEFINITION_LIST_PACKET = 0x7A;
    byte SET_LOCAL_PLAYER_AS_INITIALIZED_PACKET = 0x71;
    byte INTERACT_PACKET = 0x21;
    byte PLAYER_MOVE_PACKET = 0x13;
    byte TEXT_PACKET = 0x09;
    byte UPDATE_ATTRIBUTES_PACKET = 0x1d;
    byte PLAYER_LIST_PACKET = 0x3f;
    byte NETWORK_CHUNK_PUBLISHER_UPDATE_PACKET = 0x79;
    byte INVENTORY_TRANSACTION_PACKET = 0x1e;
    byte ADD_PLAYER_PACKET = 0x0c;
    byte REMOVE_ENTITY_PACKET = 0x0e;
    byte ANIMATE_PACKET = 0x2c;
    byte PLAYER_ACTION_PACKET = 0x24;
    int EMOTE_LIST_PACKET = 0x98;
    byte BLOCK_PICK_REQUEST_PACKET = 0x22;
    byte COMMAND_REQUEST_PACKET = 0x4d;
    byte AVAILABLE_COMMANDS_PACKET = 0x4c;
    byte ENTITY_MOVE_PACKET = 0x12;
    byte ADD_ITEM_ENTITY_PACKET = 0x0f;
    byte TAKE_ENTITY_ITEM_PACKET = 0x11;
}
