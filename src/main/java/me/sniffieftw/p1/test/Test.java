package me.sniffieftw.p1.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Test extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println(ChatColor.RED + "The plugin has started");
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void registerCommands (){
        getCommand("test").setExecutor(new commands());

    }



}
