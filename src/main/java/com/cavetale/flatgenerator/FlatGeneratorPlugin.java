package com.cavetale.flatgenerator;

import java.util.logging.Level;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.plugin.java.JavaPlugin;

public final class FlatGeneratorPlugin extends JavaPlugin {
    protected static final FlatGenerator GENERATOR = new FlatGenerator();
    protected static final FlatBiomeProvider BIOME_PROVIDER = new FlatBiomeProvider(Biome.THE_VOID);

    @Override
    public FlatGenerator getDefaultWorldGenerator(String worldName, String id) {
        return GENERATOR;
    }

    @Override
    public BiomeProvider getDefaultBiomeProvider(String worldName, String id) {
        if (id == null) return BIOME_PROVIDER;
        try {
            return new FlatBiomeProvider(Biome.valueOf(id.toUpperCase()));
        } catch (IllegalArgumentException iae) {
            getLogger().log(Level.SEVERE, "world=" + worldName + " id=" + id, iae);
            return BIOME_PROVIDER;
        }
    }
}
