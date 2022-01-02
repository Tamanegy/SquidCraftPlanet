package net.squidcraft.com.main.event;

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
        stand.setCustomName("§b" + timer);
        timer++;
        if(timer == 101){
            cancel();
        }
    }
}
