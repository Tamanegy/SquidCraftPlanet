package net.squidcraft.com.main.event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class deathMessage implements Listener {
  @EventHandler
  public void death(PlayerDeathEvent e) {
    if (e.getDeathMessage().contains("died"))
      e.setDeathMessage(e.getEntity().getName() + " à manqué d'oxygène"); 
  }
}
