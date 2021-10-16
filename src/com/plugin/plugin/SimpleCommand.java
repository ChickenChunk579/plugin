package com.plugin.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_17_R1.inventory.CraftItemStack;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Server;

public class SimpleCommand implements CommandExecutor {

    ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
    {
        {
            item.addEnchantment(Enchantment.MENDING, 1);
        }
    };

    public Server getServer() {
        return Bukkit.getServer();
    }

    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            getServer().dispatchCommand(getServer().getConsoleSender(), "/give @p diamond_pickaxe{display:{Name:'{'text':'Thiccaxe','color':'dark_red','bold':true,'underlined':true}',Lore:['{'text':'It is thicc and it is a pickaxe','color':'gold'}']},RepairCost:4387483964587956746574819567483915647839156748319,Damage:38927483296483264236472,{},Enchantments:[{}]} 1");
        }

        System.out.println("Hello!");

        // If the player (or console) uses our command correct, we can return true
        return true;
    }
}