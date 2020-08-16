package me.sniffieftw.p1.test;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("test")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (sender.hasPermission("test")) {
                    ItemStack diamond = new ItemStack(Material.DIAMOND);
                    diamond.setAmount(64);
                    player.getInventory().addItem(diamond);
                    player.sendMessage(ChatColor.AQUA + "You have been given Kit Diamond");

                } else {
                    player.sendMessage(ChatColor.RED + "You do not have permission to do that!");
                }
            }
        }
        return true;
    }
}
