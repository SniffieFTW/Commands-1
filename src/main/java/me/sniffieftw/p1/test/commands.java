package me.sniffieftw.p1.test;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (command.getName().equalsIgnoreCase("test")) {
            if (sender instanceof Player) {
                if (sender.hasPermission("test")) {
                    ItemStack diamond = new ItemStack(Material.DIAMOND);
                    diamond.setAmount(64);
                    player.getInventory().addItem(diamond);
                    player.sendMessage(ChatColor.AQUA + "You have been given Kit Diamond");

                } else {
                    player.sendMessage(ChatColor.RED + "You do not have permission to do that!");
                }
            }
            return true;
        } else if (command.getName().equalsIgnoreCase("spam")) {
            if (sender.hasPermission("spam")) {
                player.sendMessage(ChatColor.RED + "This is a test");
            }
        } else if (command.getName().equalsIgnoreCase("craft")){
            if(((Player) sender).isFlying()){
                player.sendMessage(ChatColor.DARK_PURPLE + "Fly Speed 2 Enabled");
                float v = 0.1F;
                player.setFlySpeed(v);
            }
            //set fly
        } else if (command.getName().equalsIgnoreCase("fly")) {
            if(((Player) sender).isFlying()) {
                player.sendMessage(ChatColor.DARK_PURPLE + "You are no longer Flying");
                player.setAllowFlight(false);
            } else {
                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.DARK_PURPLE + "You are Flying");
            }
        } else if (command.getName().equalsIgnoreCase("heals")){
            if(((Player) sender).getHealth() != 20) {
                player.setHealth(20);
                player.sendMessage(ChatColor.GREEN + "You have been Healed present");
            } else {
                player.sendMessage(ChatColor.RED + "You are Completely Healed");
            }
        } else if (command.getName().equalsIgnoreCase("dog")) {
            player.sendMessage(ChatColor.RED + "Commands you can use" +
                    "/heal: heals the player" +
                    "/fly: makes you go zoom");
        } else if (command.getName().equalsIgnoreCase("kit")) {
            if (((Player) sender).getGameMode().equals(GameMode.CREATIVE)) {
                player.setGameMode(GameMode.SURVIVAL);
            } else {
                player.sendMessage(ChatColor.MAGIC + "k" + ChatColor.GREEN + " Kit Diamond " + ChatColor.MAGIC + ChatColor.RED + "k");
                player.setGameMode(GameMode.CREATIVE);
            }
        }
        return true;
    }
}
