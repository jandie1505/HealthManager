package net.jandie1505.healthmanager.config;

import net.jandie1505.healthmanager.HealthManager;
import org.apache.commons.text.StringSubstitutor;
import org.bukkit.Bukkit;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Messages {
    private static File messagesFile;
    private static FileConfiguration messages;



    public static String prefix;
    public static String nopermission;
    public static String commandNotFound;
    public static String wrongSyntax;
    public static String playernotfound;

    public static String playerreset;
    public static String playerresettarget;

    public static String stateMessage1;
    public static String stateMessage2;

    public static String[] helpMessage = new String[16];


    public static String healmessage;
    public static String healmessageothers;

    public static String sethealthMessage;
    public static String sethealthTargetMessage;

    public static String sethungerMessage;
    public static String sethungerTargetMessage;

    public static String gethealthMessage;

    public static String gethungerMessage;

    public static String healthSetMessage;
    public static String healthSetTargetMessage;
    public static String healthGetMessage;
    public static String healthAddMessage;
    public static String healthAddTargetMessage;
    public static String healthRemoveMessage;
    public static String healthRemoveTargetMessage;
    public static String healthErrorMessage;

    public static String maxhealthSetMessage;
    public static String maxhealthSetTargetMessage;
    public static String maxhealthGetMessage;
    public static String maxhealthAddMessage;
    public static String maxhealthAddTargetMessage;
    public static String maxhealthRemoveMessage;
    public static String maxhealthRemoveTargetMessage;
    public static String maxhealthResetMessage;
    public static String maxhealthResetTargetMessage;

    public static String foodSetMessage;
    public static String foodSetTargetMessage;
    public static String foodGetMessage;
    public static String foodAddMessage;
    public static String foodAddTargetMessage;
    public static String foodRemoveMessage;
    public static String foodRemoveTargetMessage;
    public static String foodErrorMessage;

    private static String saturationSetMessage;
    private static String saturationSetTargetMessage;
    private static String saturationGetMessage;
    private static String saturationAddMessage;
    private static String saturationAddTargetMessage;
    private static String saturationRemoveMessage;
    private static String saturationRemoveTargetMessage;
    private static String saturationErrorMessage;

    private static String regenerationEnableMessage;
    private static String regenerationEnableTargetMessage;
    private static String regenerationDisableMessage;
    private static String regenerationDisableTargetMessage;
    private static String regenerationSetModifierMessage;
    private static String regenerationGetModifierMessage;
    private static String regenerationEnableModifierMessage;
    private static String regenerationDisableModifierMessage;

    public static String feedMessage;
    public static String feedMessageOthers;

    public static String saturationModeEnabledMessage;
    public static String saturationModeDisabledMessage;
    public static String saturationModeEnabledOthersMessage;
    public static String saturationModeDisabledOthersMessage;

    public static String godmodeEnabledMessage;
    public static String godmodeDisabledMessage;
    public static String godmodeEnabledOthersMessage;
    public static String godmodeDisabledOthersMessage;



    public static String getPlayerreset(String playerName){
        String message;
        String result;
        message = playerreset;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getHealMessageOthers(String playerName){
        String message;
        String result;
        message = healmessageothers;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getSethealthMessage(String playerName, double lives){
        String message;
        String result;
        message = sethealthMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "LIVES", String.valueOf(lives)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSethealthTargetMessage(int lives){
        String message;
        String result;
        message = sethealthTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "LIVES", String.valueOf(lives)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getSethungerMessage(String playerName, int foodLevel){
        String message;
        String result;
        message = sethungerMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSethungerTargetMessage(int foodLevel){
        String message;
        String result;
        message = sethungerTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getGethealthMessage(String playerName, int lives){
        String message;
        String result;
        message = gethealthMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "LIVES", String.valueOf(lives)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getGethungerMessage(String playerName, int foodLevel){
        String message;
        String result;
        message = gethungerMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getHealthSetMessage(String playerName, int health){
        String message;
        String result;
        message = healthSetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "HEALTH", String.valueOf(health)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthSetTargetMessage(int health){
        String message;
        String result;
        message = healthSetTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "HEALTH", String.valueOf(health)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthGetMessage(String playerName, double health){
        String message;
        String result;
        message = healthGetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "HEALTH", String.valueOf(health)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthAddMessage(String playerName, int health, int addedHealth){
        String message;
        String result;
        message = healthAddMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "HEALTH", String.valueOf(health),
                "ADDEDHEALTH", String.valueOf(addedHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthAddTargetMessage(int health, int addedHealth){
        String message;
        String result;
        message = healthAddTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "HEALTH", String.valueOf(health),
                "ADDEDHEALTH", String.valueOf(addedHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthRemoveMessage(String playerName, int health, int removedHealth){
        String message;
        String result;
        message = healthRemoveMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "HEALTH", String.valueOf(health),
                "REMOVEDHEALTH", String.valueOf(removedHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthRemoveTargetMessage(int health, int removedHealth){
        String message;
        String result;
        message = healthRemoveTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "HEALTH", String.valueOf(health),
                "REMOVEDHEALTH", String.valueOf(removedHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getHealthErrorMessage(){
        return healthErrorMessage;
    }

    public static String getMaxhealthSetMessage(String playerName, int maxHealth){
        String message;
        String result;
        message = maxhealthSetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "MAXHEALTH", String.valueOf(maxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthSetTargetMessage(int maxHealth){
        String message;
        String result;
        message = maxhealthSetTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "MAXHEALTH", String.valueOf(maxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthGetMessage(String playerName, int maxHealth){
        String message;
        String result;
        message = maxhealthGetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "MAXHEALTH", String.valueOf(maxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthAddMessage(String playerName, int maxHealth, int addedMaxHealth){
        String message;
        String result;
        message = maxhealthAddMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "MAXHEALTH", String.valueOf(maxHealth),
                "ADDEDMAXHEALTH", String.valueOf(addedMaxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthAddTargetMessage(int maxHealth, int addedMaxHealth){
        String message;
        String result;
        message = maxhealthAddTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "MAXHEALTH", String.valueOf(maxHealth),
                "ADDEDMAXHEALTH", String.valueOf(addedMaxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthRemoveMessage(String playerName, int maxHealth, int removedMaxHealth){
        String message;
        String result;
        message = maxhealthRemoveMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "MAXHEALTH", String.valueOf(maxHealth),
                "REMOVEDMAXHEALTH", String.valueOf(removedMaxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthRemoveTargetMessage(int maxHealth, int removedMaxHealth){
        String message;
        String result;
        message = maxhealthRemoveTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "MAXHEALTH", String.valueOf(maxHealth),
                "REMOVEDMAXHEALTH", String.valueOf(removedMaxHealth)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthResetMessage(String playerName){
        String message;
        String result;
        message = maxhealthResetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getMaxhealthResetTargetMessage(){
        return maxhealthResetTargetMessage;
    }

    public static String getFoodSetMessage(String playerName, int foodLevel){
        String message;
        String result;
        message = foodSetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodSetTargetMessage(int foodLevel){
        String message;
        String result;
        message = foodSetTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodGetMessage(String playerName, int foodLevel){
        String message;
        String result;
        message = foodGetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodAddMessage(String playerName, int foodLevel, int addedFoodLevel){
        String message;
        String result;
        message = foodAddMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel),
                "ADDEDFOODLEVEL", String.valueOf(addedFoodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodAddTargetMessage(int foodLevel, int addedFoodLevel){
        String message;
        String result;
        message = foodAddTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "FOODLEVEL", String.valueOf(foodLevel),
                "ADDEDFOODLEVEL", String.valueOf(addedFoodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodRemoveMessage(String playerName, int foodLevel, int removedFoodLevel){
        String message;
        String result;
        message = foodRemoveMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "FOODLEVEL", String.valueOf(foodLevel),
                "REMOVEDFOODLEVEL", String.valueOf(removedFoodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodRemoveTargetMessage(int foodLevel, int removedFoodLevel){
        String message;
        String result;
        message = foodRemoveTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "FOODLEVEL", String.valueOf(foodLevel),
                "REMOVEDFOODLEVEL", String.valueOf(removedFoodLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getFoodErrorMessage(){
        return foodErrorMessage;
    }

    public static String getSaturationSetMessage(String playerName, int saturationLevel){
        String message;
        String result;
        message = saturationSetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "SATURATIONLEVEL", String.valueOf(saturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationSetTargetMessage(int saturationLevel){
        String message;
        String result;
        message = saturationSetTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "SATURATIONLEVEL", String.valueOf(saturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationGetMessage(String playerName, int saturationLevel){
        String message;
        String result;
        message = saturationGetMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "SATURATIONLEVEL", String.valueOf(saturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationAddMessage(String playerName, int saturationLevel, int addedSaturationLevel){
        String message;
        String result;
        message = saturationAddMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "SATURATIONLEVEL", String.valueOf(saturationLevel),
                "ADDEDSATURATIONLEVEL", String.valueOf(addedSaturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationAddTargetMessage(int saturationLevel, int addedSaturationLevel){
        String message;
        String result;
        message = saturationAddTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "SATURATIONLEVEL", String.valueOf(saturationLevel),
                "ADDEDSATURATIONLEVEL", String.valueOf(addedSaturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationRemoveMessage(String playerName, int saturationLevel, int removedSaturationLevel){
        String message;
        String result;
        message = saturationRemoveMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName,
                "SATURATIONLEVEL", String.valueOf(saturationLevel),
                "REMOVEDSATURATIONLEVEL", String.valueOf(removedSaturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationRemoveTargetMessage(int saturationLevel, int removedSaturationLevel){
        String message;
        String result;
        message = saturationRemoveTargetMessage;
        Map<String, String> replacementStrings = Map.of(
                "SATURATIONLEVEL", String.valueOf(saturationLevel),
                "REMOVEDSATURATIONLEVEL", String.valueOf(removedSaturationLevel)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationErrorMessage(){
        return saturationErrorMessage;
    }

    public static String getRegenerationEnableMessage(String playerName){
        String message;
        String result;
        message = regenerationEnableMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", String.valueOf(playerName)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getRegenerationEnableTargetMessage(){
        return regenerationEnableTargetMessage;
    }
    public static String getRegenerationDisableMessage(String playerName){
        String message;
        String result;
        message = regenerationDisableMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", String.valueOf(playerName)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getRegenerationDisableTargetMessage(){
        return regenerationDisableTargetMessage;
    }
    public static String getRegenerationSetModifierMessage(int time, int health){
        String message;
        String result;
        message = regenerationSetModifierMessage;
        Map<String, String> replacementStrings = Map.of(
                "TIME", String.valueOf(time),
                "HEALTH", String.valueOf(health)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getRegenerationGetModifierMessage(int time, int health, boolean enabled){
        String message;
        String result;
        String enableString = "No";
        message = regenerationGetModifierMessage;
        if(enabled){
            enableString = "Yes";
        } else {
            enableString = "No";
        }
        Map<String, String> replacementStrings = Map.of(
                "TIME", String.valueOf(time),
                "HEALTH", String.valueOf(health),
                "ENABLED", String.valueOf(enableString)
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getRegenerationEnableModifierMessage(){
        return regenerationEnableModifierMessage;
    }
    public static String getRegenerationDisableModifierMessage(){
        return regenerationDisableModifierMessage;
    }

    public static String getFeedMessageOthers(String playerName){
        String message;
        String result;
        message = feedMessageOthers;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getSaturationModeEnabledOthersMessage(String playerName){
        String message;
        String result;
        message = saturationModeEnabledOthersMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getSaturationModeDisabledOthersMessage(String playerName){
        String message;
        String result;
        message = saturationModeDisabledOthersMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getGodmodeEnabledOthersMessage(String playerName){
        String message;
        String result;
        message = godmodeEnabledOthersMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }
    public static String getGodmodeDisabledOthersMessage(String playerName){
        String message;
        String result;
        message = godmodeDisabledOthersMessage;
        Map<String, String> replacementStrings = Map.of(
                "PLAYER", playerName
        );
        StringSubstitutor sub = new StringSubstitutor(replacementStrings, "{", "}");
        result = sub.replace(message);
        return result;
    }

    public static String getStateMessage() {
        return stateMessage1 + "\n" + stateMessage2;
    }



    public static void defaultMessage(Player player, String message){
        if(!message.equals("") && message != null){
            player.sendMessage(prefix + message);
        }
    }
    public static void MessageWithoutPrefix(Player player, String message){
        if(!message.equals("") && message != null){
            player.sendMessage(message);
        }
    }



    public static void load(){
        createCustomConfig();

        prefix = messages.getString("prefix");
        nopermission = messages.getString("nopermission");
        commandNotFound = messages.getString("commandnotfound");
        wrongSyntax = messages.getString("wrongsyntax");
        playernotfound = messages.getString("playernotfound");

        playerreset = messages.getString("playerreset");
        playerresettarget = messages.getString("playerresettarget");

        stateMessage1 = "§6HealthManager2 (" + HealthManager.getVersion() + ") by jandie1505";
        stateMessage2 = "§eUse /healthmanager help for more information";

        helpMessage[0] = Messages.prefix + "§eHealthManager2 Help:";
        helpMessage[1] = Messages.prefix + "§7/healthmanager - Status command";
        helpMessage[2] = Messages.prefix + "§7/healthmanager help - Help command";
        helpMessage[3] = Messages.prefix + "§7/healthmanager reload - Reload messages";
        helpMessage[4] = Messages.prefix + "§7/healthmanager reset <Player> - Reset all modifiers of healthmanager for a specific player";
        helpMessage[5] = Messages.prefix + "§7/heal ([Player]) - Heal yourself (or a specific player)";
        helpMessage[6] = Messages.prefix + "§7/sethealth [Player] [Amount] - Set the health level of a specific player";
        helpMessage[7] = Messages.prefix + "§7/maxhealth <get/set/add/remove/reset> [Player] [Amount] - Set the max health level of a specific player";
        helpMessage[8] = Messages.prefix + "§7/gethealth [Player] - See the health level of a specific player";
        helpMessage[9] = Messages.prefix + "§7/feed ([Player]) - Feed yourself (or a specific player)";
        helpMessage[10] = Messages.prefix + "§7/sethunger [Player] - Set the food level of a specific player";
        helpMessage[11] = Messages.prefix + "§7/gethunger [Player] - Get the food level of a specific player";
        helpMessage[12] = Messages.prefix + "§7/setsaturation [Player] - Set the saturation level of a specific player";
        helpMessage[13] = Messages.prefix + "§7/saturation ([Player]) - Turn on/off saturation mode for yourself (or a specific player)";
        helpMessage[14] = Messages.prefix + "§7/god ([Player]) - Turn on/off god mode for yourself (or a specific player)";
        helpMessage[15] = Messages.prefix + "If the commands do not exist, they exist as subcommands in the /healthmanager command";

        healmessage = messages.getString("healmessage");
        healmessageothers = messages.getString("healmessageothers");

        sethealthMessage = messages.getString("sethealthmessage");
        sethealthTargetMessage = messages.getString("sethealthtargetmessage");

        sethungerMessage = messages.getString("sethungermessage");
        sethungerTargetMessage = messages.getString("sethungertargetmessage");

        gethealthMessage = messages.getString("gethealthmessage");

        gethungerMessage = messages.getString("gethungermessage");

        healthSetMessage = messages.getString("healthSetMessage");
        healthSetTargetMessage = messages.getString("healthSetTargetMessage");
        healthGetMessage = messages.getString("healthGetMessage");
        healthAddMessage = messages.getString("healthAddMessage");
        healthAddTargetMessage = messages.getString("healthAddTargetMessage");
        healthRemoveMessage = messages.getString("healthRemoveMessage");
        healthRemoveTargetMessage = messages.getString("healthRemoveTargetMessage");
        healthErrorMessage = messages.getString("healthErrorMessage");

        maxhealthSetMessage = messages.getString("maxhealthSetMessage");
        maxhealthSetTargetMessage = messages.getString("maxhealthSetTargetMessage");
        maxhealthGetMessage = messages.getString("getmaxhealthmessage");
        maxhealthAddMessage = messages.getString("maxhealthAddMessage");
        maxhealthAddTargetMessage = messages.getString("maxhealthAddTargetMessage");
        maxhealthRemoveMessage = messages.getString("maxhealthRemoveMessage");
        maxhealthRemoveTargetMessage = messages.getString("maxhealthRemoveTargetMessage");
        maxhealthResetMessage = messages.getString("maxhealthResetMessage");
        maxhealthResetTargetMessage = messages.getString("maxhealthResetTargetMessage");

        foodSetMessage = messages.getString("foodSetMessage");
        foodSetTargetMessage = messages.getString("foodSetTargetMessage");
        foodGetMessage = messages.getString("foodGetMessage");
        foodAddMessage = messages.getString("foodAddMessage");
        foodAddTargetMessage = messages.getString("foodAddTargetMessage");
        foodRemoveMessage = messages.getString("foodRemoveMessage");
        foodRemoveTargetMessage = messages.getString("foodRemoveTargetMessage");
        foodErrorMessage = messages.getString("foodErrorMessage");

        saturationSetMessage = messages.getString("saturationSetMessage");
        saturationSetTargetMessage = messages.getString("saturationSetTargetMessage");
        saturationGetMessage = messages.getString("saturationGetMessage");
        saturationAddMessage = messages.getString("saturationAddMessage");
        saturationAddTargetMessage = messages.getString("saturationAddTargetMessage");
        saturationRemoveMessage = messages.getString("saturationRemoveMessage");
        saturationRemoveTargetMessage = messages.getString("saturationRemoveTargetMessage");
        saturationErrorMessage = messages.getString("saturationErrorMessage");

        regenerationEnableMessage = messages.getString("regenerationEnabledMessage");
        regenerationEnableTargetMessage = messages.getString("regenerationEnabledTargetMessage");
        regenerationDisableMessage = messages.getString("regenerationDisabledMessage");
        regenerationDisableTargetMessage = messages.getString("regenerationDisabledTargetMessage");
        regenerationSetModifierMessage = messages.getString("regenerationSetModifierMessage");
        regenerationGetModifierMessage = messages.getString("regenerationGetModifierMessage");
        regenerationEnableModifierMessage = messages.getString("regenerationEnableModifierMessage");
        regenerationDisableModifierMessage = messages.getString("regenerationDisableModifierMessage");

        feedMessage = messages.getString("feedmessage");
        feedMessageOthers = messages.getString("feedmessageothers");

        saturationModeEnabledMessage = messages.getString("saturationmodeenabledmessage");
        saturationModeDisabledMessage = messages.getString("saturationmodedisabledmessage");
        saturationModeEnabledOthersMessage = messages.getString("saturationmodeenableothersmessage");
        saturationModeDisabledOthersMessage = messages.getString("saturationmodedisableothersmessage");

        godmodeEnabledMessage = messages.getString("godmodeenabledmessage");
        godmodeDisabledMessage = messages.getString("godmodedisabledmessage");
        godmodeEnabledOthersMessage = messages.getString("godmodeenabledothersmessage");
        godmodeDisabledOthersMessage = messages.getString("godmodedisabledothersmessage");
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
