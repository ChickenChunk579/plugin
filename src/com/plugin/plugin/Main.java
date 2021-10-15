package com.plugin.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        System.out.println("[Plugin] §aCode Load");
    }

    @Override
    public void onDisable()
    {
        System.out.println("[Plugin] §bCode Unload");
    }
}