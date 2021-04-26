package com.cavetale.flatgenerator;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;

public final class FlatGenerator extends ChunkGenerator {
    @Override
    public ChunkData generateChunkData(final World world, final Random random, final int chunkX, final int chunkZ, final BiomeGrid biome) {
        ChunkData result = createChunkData(world);
        result.setRegion(0, 0, 0, 16, 1, 16, Material.BEDROCK);
        result.setRegion(0, 1, 0, 16, 48, 16, Material.STONE);
        result.setRegion(0, 48, 0, 16, 63, 16, Material.DIRT);
        result.setRegion(0, 63, 0, 16, 64, 16, Material.GRASS_BLOCK);
        return result;
    }

    @Override
    public boolean canSpawn(final World world, final int x, final int z) {
        return false;
    }

    @Override
    public List<BlockPopulator> getDefaultPopulators(final World world) {
        return Collections.emptyList();
    }

    @Override
    public Location getFixedSpawnLocation(final World world, final Random random) {
        return new Location(world, 255.5, 64.0, 255.5);
    }
}
