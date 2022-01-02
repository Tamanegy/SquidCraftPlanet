package net.squidcraft.com.main.commands;

import net.squidcraft.com.main.itemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DebugCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        itemManager item = new itemManager();
        Player player = (Player) sender;

        if(!(sender instanceof Player)){
            sender.sendMessage("Vous devez être un joueur");
        }

        if(args.length == 0){
            player.getInventory().addItem(item.HumidityAbsorber());
            player.getInventory().addItem(item.Oxygene());
            player.getInventory().addItem(item.Fibre());
            player.getInventory().addItem(item.Circuit());
            player.updateInventory();
        }


        return false;
    }
}
