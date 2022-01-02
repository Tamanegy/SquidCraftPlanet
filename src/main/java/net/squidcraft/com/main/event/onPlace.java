package net.squidcraft.com.main.event;

import net.squidcraft.com.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class onPlace implements Listener {
  @EventHandler
  public void Place(BlockPlaceEvent e) {
    Timer timer;
    onClick Click;
    Player player = e.getPlayer();
    if(e.getBlock().getType().equals(Material.CYAN_GLAZED_TERRACOTTA)){
      ArmorStand armor = Bukkit.getWorld("world").spawn(e.getBlock().getLocation().add(0.5,-1,0.5), ArmorStand.class);
      armor.setInvisible(true);
      timer = new Timer(armor);
      timer.runTaskTimer(Main.instance, 0, 20);
      armor.setCustomNameVisible(true);
      armor.setGravity(false);
      armor.setInvulnerable(true);
      ArmorStand armor2 = Bukkit.getWorld("world").spawn(e.getBlock().getLocation().add(0.5,-0.8,0.5), ArmorStand.class);
      armor2.setCustomName("§bAbsorbeur d'humidité");
      armor2.setCustomNameVisible(true);
      armor2.setGravity(false);
      armor2.setInvulnerable(true);
      armor2.setInvisible(true);
    }
  }
}
