package net.squidcraft.com.main.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class onPortal implements Listener {

    @EventHandler
    public void Portal(PlayerPortalEvent e){
        e.setCancelled(true);
    }

}
