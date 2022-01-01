package net.squidcraft.com.main;

import net.squidcraft.com.main.event.deathMessage;
import net.squidcraft.com.main.event.onBreak;
import net.squidcraft.com.main.event.onJoin;
import net.squidcraft.com.main.event.onLeaves;
import net.squidcraft.com.main.event.onPlace;
import net.squidcraft.com.main.event.onRespawn;
import net.squidcraft.com.main.event.onSpawn;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
  public static Main instance;
  
  public void onEnable() {
    craftManager.Manager();
    itemManager item = new itemManager();
    getServer().getPluginManager().registerEvents(new onJoin(), this);
    getServer().getPluginManager().registerEvents(new onBreak(), (this));
    getServer().getPluginManager().registerEvents(new onLeaves(), this);
    getServer().getPluginManager().registerEvents(new onPlace(), this);
    getServer().getPluginManager().registerEvents(new deathMessage(), this);
    getServer().getPluginManager().registerEvents(new onRespawn(),this);
    getServer().getPluginManager().registerEvents(new onSpawn(),this);
    instance = this;
    Bukkit.getWorld("world").setPVP(false);
  }
  
  public void onDisable() {}
}
