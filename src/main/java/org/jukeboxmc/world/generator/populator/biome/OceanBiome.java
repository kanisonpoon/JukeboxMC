package org.jukeboxmc.world.generator.populator.biome;

import org.jukeboxmc.world.generator.populator.KelpPopulator;
import org.jukeboxmc.world.generator.populator.SeagrassPopulator;

/**
 * @author LucGamesYT
 * @version 1.0
 */
public class OceanBiome extends BiomePopulator {

    public OceanBiome() {
        KelpPopulator kelpPopulator = new KelpPopulator();
        kelpPopulator.setBaseAmount( -135 );
        kelpPopulator.setRandomAmount( 180 );
        this.addPopulator( kelpPopulator );

        SeagrassPopulator seagrassPopulator = new SeagrassPopulator( 0.3 );
        seagrassPopulator.setBaseAmount( 24 );
        seagrassPopulator.setRandomAmount( 24 );
        this.addPopulator( seagrassPopulator );
    }
}