package com.cavetale.flatgenerator;

import org.bukkit.plugin.java.JavaPlugin;

public final class FlatGeneratorPlugin extends JavaPlugin {
    private final FlatGenerator flatGenerator = new FlatGenerator();

    @Override
    public FlatGenerator getDefaultWorldGenerator(String worldName, String id) {
        return flatGenerator;
    }
}
