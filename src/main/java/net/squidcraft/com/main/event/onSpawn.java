package net.squidcraft.com.main.event;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;

public class onSpawn implements Listener {
  @EventHandler
  public void Spawn(EntitySpawnEvent e) {
    if (e.getEntity().getType().equals(EntityType.ZOMBIE)) {
      Zombie zombie = (Zombie)e.getEntity();
      zombie.getEquipment().setHelmet(new ItemStack(Material.GLASS));
      zombie.getEquipment().setHelmetDropChance(0.0F);
    } else if (e.getEntity().getType().equals(EntityType.SKELETON)) {
      Skeleton skel = (Skeleton)e.getEntity();
      skel.getEquipment().setHelmet(new ItemStack(Material.GLASS));
      skel.getEquipment().setHelmetDropChance(0.0F);
    } 
    if (!e.getEntity().getType().equals(EntityType.ZOMBIE) && !e.getEntity().getType().equals(EntityType.SKELETON) && !e.getEntity().getType().equals(EntityType.DROPPED_ITEM))
      e.setCancelled(true); 
  }
}
