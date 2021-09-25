package net.jandie1505.healthmanager.config;

import net.jandie1505.healthmanager.HealthManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Messages {
    private static File messagesFile;
    private static FileConfiguration messages;

    public static void load() {
        createCustomConfig();

    }

    public FileConfiguration getCustomConfig() {
        return messages;
    }

    private static void createCustomConfig() {
        messagesFile = new File(HealthManager.getPlugin().getDataFolder(), "messages.yml");
        if (!messagesFile.exists()) {
            messagesFile.getParentFile().mkdirs();
            HealthManager.getPlugin().saveResource("messages.yml", false);
        }

        messages = new YamlConfiguration();
        try {
            messages.load(messagesFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
            Bukkit.getLogger().warning("Messages file Error. The plugin will now disable for safety reasons.");
            Bukkit.getPluginManager().disablePlugin(HealthManager.getPlugin());
        }
    }
}
