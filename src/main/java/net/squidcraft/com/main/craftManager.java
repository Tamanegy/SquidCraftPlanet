package net.squidcraft.com.main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class craftManager {
  public static void Manager() {
    itemManager item = new itemManager();
    RecipeChoice.ExactChoice exactChoice = new RecipeChoice.ExactChoice(item.Fibre());
    ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("oxygene"), item.Oxygene());
    sr.shape(new String[] { "FWF", "W W", "FWF" });
    sr.setIngredient('F', (RecipeChoice)exactChoice);
    sr.setIngredient('W', Material.OAK_PLANKS);
    Bukkit.getServer().addRecipe((Recipe)sr);



    RecipeChoice.ExactChoice exactChoice2 = new RecipeChoice.ExactChoice(item.Fibre());
    ShapedRecipe sr2 = new ShapedRecipe(NamespacedKey.minecraft("oxygene2"), item.Oxygene());
    sr2.shape(new String[] { "FWF", "W W", "FWF" });
    sr2.setIngredient('F', (RecipeChoice)exactChoice);
    sr2.setIngredient('W', Material.BIRCH_PLANKS);
    Bukkit.getServer().addRecipe((Recipe)sr2);




  }
}
