package net.squidcraft.com.main.event;

import net.squidcraft.com.main.Main;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class onClick implements Listener {
    @EventHandler
    public void Click(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        if (e.getClickedBlock().getType().equals(Material.CYAN_GLAZED_TERRACOTTA)) {
            for (Entity entities : e.getClickedBlock().getWorld().getNearbyEntities(e.getClickedBlock().getLocation(), 0.5, 1, 0.5)) {
                if(entities.getType().equals(EntityType.ARMOR_STAND) && entities.getCustomName().equals("§2✓ " + "§b" + "100" + " §2✓") && player.getItemInHand().equals(new ItemStack(Material.BUCKET))){
                    player.getInventory().removeItem(new ItemStack(Material.BUCKET));
                    new BukkitRunnable() {
                        @Override
                        public void run() {
                            player.getInventory().addItem(new ItemStack(Material.WATER_BUCKET));
                            player.updateInventory();
                            cancel();
                        }
                    }.runTaskTimer(Main.instance, 1,20);


                }
            }

        }
    }
}
