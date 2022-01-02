package net.squidcraft.com.main.event;

import net.squidcraft.com.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;



public class onClick implements Listener {

    public int timer = 0;
public int timeradd(int amount){
    this.timer+=amount;
    return timer;
}
    @EventHandler
    public void Click(PlayerInteractEvent e){
        Player player = e.getPlayer();

        if(e.getClickedBlock().getType().equals(Material.CYAN_GLAZED_TERRACOTTA)){
            new BukkitRunnable() {
                @Override
                public void run() {
                    onClick timer = new onClick();
                    Inventory inv = Bukkit.createInventory(null, 27, "" + timer.timeradd(1));
                    player.openInventory(inv);
                }
            }.runTaskTimer(Main.instance, 0, 20);
        }

    }

}
