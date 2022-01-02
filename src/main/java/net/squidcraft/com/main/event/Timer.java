package net.squidcraft.com.main.event;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.scheduler.BukkitRunnable;

public class Timer extends BukkitRunnable {
    ArmorStand stand;
    int timer = 0;
    public Timer(ArmorStand stand){
        this.stand = stand;
    }
    @Override
    public void run() {

        if(timer < 100){
            stand.setCustomName("§c✗ " + "§b" + timer + " §c✗");
        } else{
            stand.setCustomName("§2✓ " + "§b" + timer + " §2✓");
        }

        timer++;
        if(timer == 101){
            cancel();
        }
    }
}
