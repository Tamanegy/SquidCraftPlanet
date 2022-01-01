package net.squidcraft.com.main;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class itemManager {
  public ItemStack Fibre() {
    ItemStack fiber = new ItemStack(Material.BAMBOO);
    ItemMeta meta = fiber.getItemMeta();
    meta.setDisplayName("§aFibre");
    fiber.setItemMeta(meta);
    return fiber;
  }
  
  public ItemStack Oxygene() {
    ItemStack oxygene = new ItemStack(Material.SEA_LANTERN);
    ItemMeta meta = oxygene.getItemMeta();
    meta.setDisplayName("§bBanque a oxygène");
    meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    oxygene.setItemMeta(meta);
    return oxygene;
  }
}
