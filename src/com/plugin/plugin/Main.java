package com.plugin.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import com.plugin.plugin.SimpleCommand;

public final class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        System.out.println("[Plugin] §aCode Load");
        this.getCommand("test").setExecutor(new SimpleCommand());
    }

    @Override
    public void onDisable()
    {
        System.out.println("[Plugin] §bCode Unload");
    }
}