package net.jandie1505.healthmanager.commands;

import net.jandie1505.healthmanager.HealthManager;
import net.jandie1505.healthmanager.config.Config;
import net.jandie1505.healthmanager.config.Messages;
import net.jandie1505.healthmanager.config.Placeholders;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CmdHealthmanager implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("help")) {
                    if(p.hasPermission("healthmanager.help")) {
                        for(String line : Messages.helpMessage) {
                            Messages.defaultMessage(p, line);
                        }
                    }
                } else if(args[0].equalsIgnoreCase("reload")) {
                    if(p.hasPermission("healthmanager.reload")) {
                        HealthManager.configReload();
                        Messages.defaultMessage(p, "§aConfig was reloaded successfully");
                    }
                } else if(args[0].equalsIgnoreCase("reset")) {
                    if(p.hasPermission("healthmanager.reset")) {
                        Messages.defaultMessage(p, "§cUse /healthmanager reset <Player>");
                    }
                }
            } else if(args.length == 2) {
                if(args[0].equalsIgnoreCase("reset")) {
                    if(p.hasPermission("healthmanager.reset")) {
                        Messages.defaultMessage(p, "§cUse /healthmanager reset <Player>");
                    }
                }
            } else if(args.length == 3) {
                if(args[0].equalsIgnoreCase("reset")) {
                    if(p.hasPermission("healthmanager.reset")) {
                        Player target = Bukkit.getPlayer(args[2]);
                        if(target != null) {
                            target.resetMaxHealth();
                            Messages.defaultMessage(p, Messages.getPlayerreset(target.getName()));
                            if(Config.isSendMessagesToTarget()) {
                                Messages.defaultMessage(target, Messages.playerresettarget);
                            }
                        } else {
                            Messages.defaultMessage(p, Messages.playernotfound);
                        }
                    } else {
                        Messages.defaultMessage(p, Messages.nopermission);
                    }
                }
            } else {
                p.sendMessage(Messages.getStateMessage());
            }
        } else if(sender instanceof ConsoleCommandSender) {
            if(args.length == 1) {
                if(args[0].equalsIgnoreCase("help")) {
                    for(String line : Messages.helpMessage) {
                        Bukkit.getLogger().info(line);
                    }
                } else if(args[0].equalsIgnoreCase("reload")) {
                    HealthManager.configReload();
                    Bukkit.getLogger().info( "§aConfig was reloaded successfully");
                } else if(args[0].equalsIgnoreCase("reset")) {
                    Bukkit.getLogger().info("§cUse /healthmanager reset <Player>");
                }
            } else if(args.length == 2) {
                if(args[0].equalsIgnoreCase("reset")) {
                    Bukkit.getLogger().info("§cUse /healthmanager reset <Player>");
                }
            } else if(args.length == 3) {
                if(args[0].equalsIgnoreCase("reset")) {
                    Player target = Bukkit.getPlayer(args[2]);
                    if(target != null) {
                        target.resetMaxHealth();
                        Bukkit.getLogger().info(Messages.getPlayerreset(target.getName()));
                        if(Config.isSendMessagesToTarget()) {
                            Messages.defaultMessage(target, Messages.playerresettarget);
                        }
                    } else {
                        Bukkit.getLogger().info(Messages.playernotfound);
                    }
                }
            } else {
                Bukkit.getLogger().info(Messages.getStateMessage());
            }
        }
        return true;
    }

    @Nullable
    @Override
    public List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        List<String> tabComplete = new ArrayList<>();

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length == 1) {
                if(p.hasPermission("healthmanager.help")) {
                    tabComplete.add("help");
                }
                if(p.hasPermission("healthmanager.reload")) {
                    tabComplete.add("reload");
                }
                if(p.hasPermission("healthmanager.reset")) {
                    tabComplete.add("reset");
                }
            } else if(args.length == 2) {
                if(p.hasPermission("healthmanager.reset")) {
                    if(args[0].equalsIgnoreCase("reset")) {
                        for(Player target : Bukkit.getOnlinePlayers()) {
                            tabComplete.add(target.getName());
                        }
                    }
                }
            }
        }

        return tabComplete;
    }
}
