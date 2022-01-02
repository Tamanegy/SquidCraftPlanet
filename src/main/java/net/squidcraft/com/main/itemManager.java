package net.squidcraft.com.main;


import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


import java.util.ArrayList;



public class itemManager {
  public ItemStack Fibre() {
    ItemStack fiber = new ItemStack(Material.BAMBOO);
    ItemMeta meta = fiber.getItemMeta();
    meta.setDisplayName("§aFibre");
    fiber.setItemMeta(meta);
    return fiber;
  }
  
  public ItemStack Oxygene() {
    ArrayList<String> list = new ArrayList<>();
    list.add("§3Ravitailler vous en oxygène ");
    list.add("§3avec ce block.");

    ItemStack oxygene = new ItemStack(Material.SEA_LANTERN);
    ItemMeta meta = oxygene.getItemMeta();
    meta.setDisplayName("§bBanque a oxygène");
    meta.setLore(list);
    meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    oxygene.setItemMeta(meta);
    return oxygene;
  }
  public ItemStack Circuit(){
    ArrayList<String> list = new ArrayList<>();
    list.add("§3Craftez tout type de block");
    list.add("§3avec de matériel.");

    ItemStack circuit = new ItemStack(Material.GHAST_TEAR);
    ItemMeta meta = circuit.getItemMeta();
    meta.setLore(list);
    meta.setDisplayName("§6Circuit imprimé");
    meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    circuit.setItemMeta(meta);
    return circuit;
  }

  public ItemStack HumidityAbsorber(){
    ArrayList<String> list = new ArrayList<>();
    list.add("§3Récoltez de l'eau avec ");
    list.add("§3ce block.");

    ItemStack humidity = new ItemStack(Material.CYAN_GLAZED_TERRACOTTA);
    ItemMeta meta = humidity.getItemMeta();
    meta.setLore(list);
    meta.setDisplayName("§9Absorbeur d'humidité");
    meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
    meta.addItemFlags(new ItemFlag[] { ItemFlag.HIDE_ENCHANTS });
    humidity.setItemMeta(meta);
    return humidity;
  }
}
