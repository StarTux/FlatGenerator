package com.cavetale.flatgenerator;

import java.util.List;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;

public final class FlatBiomeProvider extends BiomeProvider {
    private final Biome biome;

    public FlatBiomeProvider(final Biome biome) {
        this.biome = biome;
    }

    @Override
    public Biome getBiome(WorldInfo worldInfo, int x, int y, int z) {
        return biome;
    }

    @Override
    public List<Biome> getBiomes(WorldInfo worldInfo) {
        return List.of(biome);
    }
}
