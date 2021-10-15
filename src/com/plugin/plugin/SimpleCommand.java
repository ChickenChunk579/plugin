package com.plugin.plugin;

import org.bukkit.command.CommandExecutor;

public class SimpleCommand implements CommandExecutor {

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack diamond = new ItemStack(Material.DIAMOND);

            // Create a new ItemStack (type: brick)
            ItemStack bricks = new ItemStack(Material.BRICK);

            // Set the amount of the ItemStack
            bricks.setAmount(20);

            // Give the player our items (comma-seperated list of all ItemStack)
            player.getInventory().addItem(bricks, diamond);
        }

        System.out.println("Hello!");

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}