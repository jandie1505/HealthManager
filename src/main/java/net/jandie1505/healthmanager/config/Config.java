package net.jandie1505.healthmanager.config;

import net.jandie1505.healthmanager.HealthManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {
    private static File configFile;
    private static FileConfiguration config;

    private static boolean sendMessagesToTarget;
    private static boolean papiEnabled;
    private static boolean updateNotify;


    public static boolean isSendMessagesToTarget() {
        return sendMessagesToTarget;
    }

    public static boolean isPapiEnabled() {
        return papiEnabled;
    }

    public static boolean isUpdateNotify() {
        return updateNotify;
    }



    public static void load() {
        createCustomConfig();
        sendMessagesToTarget = config.getBoolean("sendMessagesToTarget");
        papiEnabled = config.getBoolean("placeholderapi");
        updateNotify = config.getBoolean("updateNotify");
    }

    public FileConfiguration getCustomConfig() {
        return config;
    }

    private static void createCustomConfig() {
        configFile = new File(HealthManager.getPlugin().getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            HealthManager.getPlugin().saveResource("config.yml", false);
        }

        config = new YamlConfiguration();
        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
            Bukkit.getLogger().warning("Configuration Error. The plugin will now disable for safety reasons.");
            Bukkit.getPluginManager().disablePlugin(HealthManager.getPlugin());
        }
    }
}
