package net.jandie1505.healthmanager.commands;

import net.jandie1505.healthmanager.config.Messages;
import org.bukkit.Bukkit;
import org.bukkit.command.*;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CmdHealth implements CommandExecutor, TabCompleter {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;
            if(args.length >= 1) {
                if(args[0].equalsIgnoreCase("get")) {
                    if(p.hasPermission("healthmanager.health.get")) {
                        if(args.length == 2) {
                            Player target = Bukkit.getPlayer(args[1]);
                            if(target != null) {
                                Messages.defaultMessage(p, Messages.getHealthGetMessage(target.getName(), target.getHealth()));
                            } else {
                                Messages.defaultMessage(p, Messages.playernotfound);
                            }
                        } else {
                            Messages.defaultMessage(p, "/health get <Player>");
                        }
                    } else {
                        Messages.defaultMessage(p, Messages.nopermission);
                    }
                } else if(args[0].equalsIgnoreCase("set")) {
                    if(p.hasPermission("healthmanager.health.set")) {
                        if(args.length == 3) {
                            Player target = Bukkit.getPlayer(args[1]);
                            if(target != null) {
                                try {
                                    target.setHealth(Double.parseDouble(args[2]));
                                    Messages.defaultMessage(p, Messages.getSethealthMessage(target.getName(), target.getHealth()));
                                } catch(Exception e) {
                                    Messages.defaultMessage(p, Messages.getHealthErrorMessage());
                                }
                            } else {
                                Messages.defaultMessage(p, Messages.playernotfound);
                            }
                        } else {
                            Messages.defaultMessage(p, "/health set <Player> <Amount>");
                        }
                    } else {
                        Messages.defaultMessage(p, Messages.nopermission);
                    }
                } else if(args[0].equalsIgnoreCase("add")) {
                    if(p.hasPermission("healthmanager.health.add")) {
                        if(args.length == 3) {
                            Player target = Bukkit.getPlayer(args[1]);
                            if(target != null) {
                                try {
                                    double newHealth = target.getHealth() + Double.parseDouble(args[2]);
                                    target.setHealth(newHealth);
                                    Messages.defaultMessage(p, Messages.getSethealthMessage(target.getName(), target.getHealth()));
                                } catch(Exception e) {
                                    Messages.defaultMessage(p, Messages.getHealthErrorMessage());
                                }
                            } else {
                                Messages.defaultMessage(p, Messages.playernotfound);
                            }
                        } else {
                            Messages.defaultMessage(p, "/health set <Player> <Amount>");
                        }
                    } else {
                        Messages.defaultMessage(p, Messages.nopermission);
                    }
                } else if(args[0].equalsIgnoreCase("remove")) {
                    if(p.hasPermission("healthmanager.health.remove")) {
                        if(args.length == 3) {
                            Player target = Bukkit.getPlayer(args[1]);
                            if(target != null) {
                                try {
                                    double newHealth = target.getHealth() - Double.parseDouble(args[2]);
                                    target.setHealth(newHealth);
                                    Messages.defaultMessage(p, Messages.getSethealthMessage(target.getName(), target.getHealth()));
                                } catch(Exception e) {
                                    Messages.defaultMessage(p, Messages.getHealthErrorMessage());
                                }
                            } else {
                                Messages.defaultMessage(p, Messages.playernotfound);
                            }
                        } else {
                            Messages.defaultMessage(p, "/health set <Player> <Amount>");
                        }
                    } else {
                        Messages.defaultMessage(p, Messages.nopermission);
                    }
                }
            }
        } else if(sender instanceof ConsoleCommandSender) {
            if(args.length >= 1) {
                if(args[0].equalsIgnoreCase("get")) {
                    if(args.length == 2) {
                        Player target = Bukkit.getPlayer(args[1]);
                        if(target != null) {
                            Bukkit.getLogger().info(Messages.getHealthGetMessage(target.getName(), target.getHealth()));
                        } else {
                            Bukkit.getLogger().info(Messages.playernotfound);
                        }
                    } else {
                        Bukkit.getLogger().info("/health get <Player>");
                    }
                } else if(args[0].equalsIgnoreCase("set")) {
                    if(args.length == 3) {
                        Player target = Bukkit.getPlayer(args[1]);
                        if(target != null) {
                            try {
                                target.setHealth(Double.parseDouble(args[2]));
                                Bukkit.getLogger().info(Messages.getSethealthMessage(target.getName(), target.getHealth()));
                            } catch(Exception e) {
                                Bukkit.getLogger().info(Messages.getHealthErrorMessage());
                            }
                        } else {
                            Bukkit.getLogger().info(Messages.playernotfound);
                        }
                    } else {
                        Bukkit.getLogger().info("/health set <Player> <Amount>");
                    }
                } else if(args[0].equalsIgnoreCase("add")) {
                    if(args.length == 3) {
                        Player target = Bukkit.getPlayer(args[1]);
                        if(target != null) {
                            try {
                                double newHealth = target.getHealth() + Double.parseDouble(args[2]);
                                target.setHealth(newHealth);
                                Bukkit.getLogger().info(Messages.getSethealthMessage(target.getName(), target.getHealth()));
                            } catch(Exception e) {
                                Bukkit.getLogger().info(Messages.getHealthErrorMessage());
                            }
                        } else {
                            Bukkit.getLogger().info(Messages.playernotfound);
                        }
                    } else {
                        Bukkit.getLogger().info("/health set <Player> <Amount>");
                    }
                } else if(args[0].equalsIgnoreCase("remove")) {
                    if(args.length == 3) {
                        Player target = Bukkit.getPlayer(args[1]);
                        if(target != null) {
                            try {
                                double newHealth = target.getHealth() - Double.parseDouble(args[2]);
                                target.setHealth(newHealth);
                                Bukkit.getLogger().info(Messages.getSethealthMessage(target.getName(), target.getHealth()));
                            } catch(Exception e) {
                                Bukkit.getLogger().info(Messages.getHealthErrorMessage());
                            }
                        } else {
                            Bukkit.getLogger().info(Messages.playernotfound);
                        }
                    } else {
                        Bukkit.getLogger().info(Messages.nopermission);
                    }
                }
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
                if(p.hasPermission("healthmanager.health.get")) {
                    tabComplete.add("get");
                }
                if(p.hasPermission("healthmanager.health.set")) {
                    tabComplete.add("set");
                }
                if(p.hasPermission("healthmanager.health.add")) {
                    tabComplete.add("add");
                }
                if(p.hasPermission("healthmanager.health.remove")) {
                    tabComplete.add("remove");
                }
            } else if(args.length == 2) {
                if(args[0].equalsIgnoreCase("get") || args[0].equalsIgnoreCase("set") || args[0].equalsIgnoreCase("add") || args[0].equalsIgnoreCase("remove")) {
                    for(Player target : Bukkit.getOnlinePlayers()) {
                        tabComplete.add(target.getName());
                    }
                }
            }
        }

        return tabComplete;
    }
}
