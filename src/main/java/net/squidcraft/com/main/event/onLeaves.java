package net.squidcraft.com.main.event;

import java.util.Random;
import net.squidcraft.com.main.itemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.inventory.ItemStack;

public class onLeaves implements Listener {
  @EventHandler
  public void Leaves(LeavesDecayEvent e) {
    itemManager item = new itemManager();
    Random random = new Random();
    if (e.getBlock().getType().equals(Material.OAK_LEAVES)) {
      int x = random.nextInt(100);
      if (x >= 0 && x <= 10)
        Bukkit.getWorld("world").dropItemNaturally(e.getBlock().getLocation(), item.Fibre()); 
      if (x >= 95 && x <= 100)
        Bukkit.getWorld("world").dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.OAK_SAPLING)); 
      if (e.getBlock().getType().equals(Material.BIRCH_LEAVES)) {
        int y = random.nextInt(100);
        if (y >= 0 && y <= 10)
          Bukkit.getWorld("world").dropItemNaturally(e.getBlock().getLocation(), item.Fibre()); 
        if (y >= 95 && y <= 100)
          Bukkit.getWorld("world").dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.BIRCH_SAPLING)); 
      } 
    } 
  }
}
