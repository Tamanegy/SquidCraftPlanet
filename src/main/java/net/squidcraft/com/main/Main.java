package net.squidcraft.com.main;

import net.squidcraft.com.main.commands.DebugCommand;
import net.squidcraft.com.main.event.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import net.overmode.fr.main.*;

public final class Main extends JavaPlugin {


  public static Main instance;

  
  public void onEnable() {
    craftManager.Manager();
    itemManager item = new itemManager();
    getCommand("debug").setExecutor(new DebugCommand());
    getServer().getPluginManager().registerEvents(new onJoin(), this);
    getServer().getPluginManager().registerEvents(new onBreak(), (this));
    getServer().getPluginManager().registerEvents(new onLeaves(), this);
    getServer().getPluginManager().registerEvents(new onPlace(), this);
    getServer().getPluginManager().registerEvents(new deathMessage(), this);
    getServer().getPluginManager().registerEvents(new onRespawn(),this);
    getServer().getPluginManager().registerEvents(new onSpawn(),this);
    getServer().getPluginManager().registerEvents(new onPortal(),this);
    instance = this;
    Bukkit.getWorld("world").setPVP(false);
  }
  
  public void onDisable() {

  }
  @EventHandler
  public void onJoin(PlayerJoinEvent e){
    Player player = e.getPlayer();


  }
}

