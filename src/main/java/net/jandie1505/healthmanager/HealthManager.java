package net.jandie1505.healthmanager;

import net.jandie1505.healthmanager.config.Config;
import net.jandie1505.healthmanager.config.Messages;
import net.jandie1505.healthmanager.config.Placeholders;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class HealthManager extends JavaPlugin {
    private static HealthManager plugin;

    @Override
    public void onEnable() {
        plugin = this;
        Config.load();
        Messages.load();
        if(Config.isPapiEnabled()) {
            Placeholders.load();
        }
        Bukkit.getLogger().info("HealthManager3 was successfully enabled");
    }

    public static HealthManager getPlugin() {
        return plugin;
    }
}
