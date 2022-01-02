package net.squidcraft.com.main.event;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.squidcraft.com.main.Main;
import net.squidcraft.com.main.oxygen;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class onRespawn implements Listener {
  @EventHandler
  public void revive(PlayerRespawnEvent e) {
    final Player player = e.getPlayer();
    final oxygen oxygen = new oxygen();
    (new BukkitRunnable() {
        public void run() {
          player.spigot().sendMessage(ChatMessageType.ACTION_BAR, (BaseComponent)new TextComponent("§b○" + oxygen.getOxygen()));
          if (oxygen.getOxygen() == -1)
            player.damage(1.0D);
          oxygen.remove(1);
        }
      }).runTaskTimer((Plugin)Main.instance, 0L, 40L);
  }
}
