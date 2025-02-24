package ir.mehran1022.api.gui;

import ir.mehran1022.flags.util.Format;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class Menu implements InventoryHolder {

    protected final Inventory inventory;
    protected final int size;

    public Menu(String title, int size) {
        this.inventory = Bukkit.createInventory(this, size, Format.colorize(String.format("&5Flags &7- %s", title)));
        this.size = size;
        fillBorders();
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    protected void fillBorders() {
        ItemStack borderItem = createItem(Material.BLACK_STAINED_GLASS_PANE, " ");
        for (int slot = 0; slot < size; slot++) {
            if (slot < 9 || slot >= size - 9 || slot % 9 == 0 || slot % 9 == 8) {
                inventory.setItem(slot, borderItem);
            }
        }
    }

    protected ItemStack createItem(Material material, String name) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(name);
            item.setItemMeta(meta);
        }
        return item;
    }

    public abstract void open(Player player);
}
