package dev.nexus.nexusclans;

import ch.jalu.configme.SettingsManager;
import ch.jalu.configme.SettingsManagerBuilder;
import dev.nexus.nexusclans.configuration.ConfigurationType;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class NexusClans extends JavaPlugin {

    private final Map<ConfigurationType, SettingsManager> files = new HashMap<>();

    private static NexusClans instance;

    @Override
    public void onEnable() {
        instance = this;
        if (!setupFiles()) {
            getLogger().severe("[Files] Error on creating plugin files, stopping...");
            setEnabled(false);
            return;
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public SettingsManager getConfiguration() { return files.get(ConfigurationType.CONFIG); }
    public SettingsManager getLanguage() { return files.get(ConfigurationType.LANG); }
    public static NexusClans getInstance() { return instance; }

    /**
     * Tutti i metodi:
     */

    private boolean setupFiles() {
        try {
            for (ConfigurationType value : ConfigurationType.values()) {
                files.put(value, SettingsManagerBuilder
                        .withYamlFile(new File(getDataFolder().getAbsolutePath() + value.getPath(), value.getFileName()))
                        .configurationData(value.getClazz())
                        .useDefaultMigrationService()
                        .create());
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
