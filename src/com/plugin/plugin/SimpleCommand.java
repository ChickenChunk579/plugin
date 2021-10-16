package com.plugin.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.command.Command;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;

public class SimpleCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
            
            ItemMeta itemmeta = item.getItemMeta();
            itemmeta.setDisplayName("Thicc Pickaxe");
            itemmeta.setLore(Arrays.asList("This is a very THICC pickaxe." ));
            item.setItemMeta(itemmeta);
        }

        System.out.println("Hello!");

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}