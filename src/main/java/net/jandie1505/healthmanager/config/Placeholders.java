package net.jandie1505.healthmanager.config;

import net.jandie1505.healthmanager.HealthManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Placeholders {
    private static File placeholdersFile;
    private static FileConfiguration placeholders;

    public static void load() {
        createCustomConfig();

    }

    public FileConfiguration getCustomConfig() {
        return placeholders;
    }

    private static void createCustomConfig() {
        placeholdersFile = new File(HealthManager.getPlugin().getDataFolder(), "placeholders.yml");
        if (!placeholdersFile.exists()) {
            placeholdersFile.getParentFile().mkdirs();
            HealthManager.getPlugin().saveResource("placeholders.yml", false);
        }

        placeholders = new YamlConfiguration();
        try {
            placeholders.load(placeholdersFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
            Bukkit.getLogger().warning("Placeholders file Error. The plugin will now disable for safety reasons.");
            Bukkit.getPluginManager().disablePlugin(HealthManager.getPlugin());
        }
    }
}
