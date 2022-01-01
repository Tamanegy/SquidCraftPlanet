package net.squidcraft.com.main.event;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class onPlace implements Listener {
  @EventHandler
  public void Place(BlockPlaceEvent e) {
    Player player = e.getPlayer();
    if (e.getBlock().getType() == Material.BAMBOO_SAPLING || e.getBlock().getType() == Material.BAMBOO) {
      e.setCancelled(true);
      player.sendMessage("§cIl semblerais que vous ne pouvez pas cultiver ceci.");
    } 
  }
}
