package me.sniffieftw.p1.test;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
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
        getCommand("spam").setExecutor(new commands());
        getCommand("craft").setExecutor(new commands());
        getCommand("fly").setExecutor(new commands());
        getCommand("heals").setExecutor(new commands());
        getCommand("dog").setExecutor(new commands());
        getCommand("kit").setExecutor(new commands());
    }
    public void registerEvents(){
        PluginManager pm = getServer().getPluginManager();

    }
}
