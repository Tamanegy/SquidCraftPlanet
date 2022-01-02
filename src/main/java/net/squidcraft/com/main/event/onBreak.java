package net.squidcraft.com.main.event;

import java.util.Random;
import net.squidcraft.com.main.itemManager;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class onBreak implements Listener {
  @EventHandler
  public void Break(BlockBreakEvent e) {
    Random random = new Random();
    Player player = e.getPlayer();
    itemManager item = new itemManager();
    
    // ARBRE OAK
    if (e.getBlock().getType() == Material.OAK_LEAVES) {
      int x = random.nextInt(100);
      e.setDropItems(false);
      if (x >= 0 && x <= 10)
        player.getWorld().dropItemNaturally(e.getBlock().getLocation(), item.Fibre());
      if (x >= 95 && x <= 100)
        player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.OAK_SAPLING)); 
    } 
    
    // ARBRE BIRCH
    if (e.getBlock().getType() == Material.BIRCH_LEAVES) {
      int y = random.nextInt(100);
      e.setDropItems(false);
      if (y >= 0 && y <= 10)
        player.getWorld().dropItemNaturally(e.getBlock().getLocation(), item.Fibre());
      if (y >= 95 && y <= 100)
        player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.BIRCH_SAPLING)); 
    } 
    
    // BANQUE A OXYGENE
    if (e.getBlock().getType() == Material.SEA_LANTERN) {
      e.setDropItems(false);
      player.getWorld().dropItemNaturally(e.getBlock().getLocation(), item.Oxygene());
    }
    // ABSORBEUR D'HUMIDITE
    if (e.getBlock().getType() == Material.CYAN_GLAZED_TERRACOTTA){
      e.setDropItems(false);
      player.getWorld().dropItemNaturally(e.getBlock().getLocation(), item.HumidityAbsorber());
      for(Entity entities: e.getBlock().getWorld().getNearbyEntities(e.getBlock().getLocation(), 0.5,1,0.5)){
        if(entities.getType().equals(EntityType.ARMOR_STAND)){
          entities.remove();
        }
      }
    }
    // GOLD ORE
    if(e.getBlock().getType() == Material.GOLD_ORE){
      int i = random.nextInt(6) + 1;
      e.setDropItems(false);
      player.getWorld().dropItemNaturally(e.getBlock().getLocation(), new ItemStack(Material.GOLD_NUGGET, i));
    }
    
  }
}
