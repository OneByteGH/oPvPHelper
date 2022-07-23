package io.github.onebytegh.opvphelper;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class OPvPHelper extends JavaPlugin {

    public void onEnable() {
        getLogger().info(logPrefix() + ChatColor.GREEN + "Successfully enabled!");
    }

    public void onDisable() {
        getLogger().info(logPrefix() + ChatColor.RED + "Successfully disabled!");
    }

    public static String logPrefix() {
        return "*1[*0OPVPHelper*1]*3 "
                .replace("*1", ChatColor.AQUA.toString())
                .replace("*0", ChatColor.GOLD.toString())
                .replace("*3", ChatColor.RESET.toString());
    }
}