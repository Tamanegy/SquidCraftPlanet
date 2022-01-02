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
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class onJoin implements Listener {
  @EventHandler
  public void Join(PlayerJoinEvent e) {
    final oxygen oxygen = new oxygen();
    final Player player = e.getPlayer();
    player.setResourcePack("https://www.dropbox.com/s/qo19fp5xfstnhue/SquidCraftPlanet.zip?dl=1");
    (new BukkitRunnable() {
        public void run() {
          player.spigot().sendMessage(ChatMessageType.ACTION_BAR, (BaseComponent)new TextComponent("§b○" + oxygen.getOxygen()));
          if (oxygen.getOxygen() == -1) {
            player.damage(1.0D);
          }
          oxygen.remove(1);
          if (player.getWorld().getBlockAt(player.getLocation().add(0.0D, -1.0D, 0.0D)).getType() == Material.SEA_LANTERN) {
            player.spawnParticle(Particle.ENCHANTMENT_TABLE, player.getLocation(), 50);
            oxygen.add(6);
          } 
        }
      }).runTaskTimer((Plugin)Main.instance, 0L, 40L);
  }
}
