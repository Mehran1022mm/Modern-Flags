package ir.mehran1022.api.gui.implementation;

import ir.mehran1022.api.flag.Continent;
import ir.mehran1022.api.gui.Menu;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public final class ContinentMenu extends Menu {

    public ContinentMenu() {
        super("&2Continents", 45);
        addContinentButtons();
    }

    private void addContinentButtons() {
        int[] slots = {20, 22, 24};
        int index = 0;

        for (Continent continent : Continent.values()) {
            if (index >= slots.length) break;
            inventory.setItem(slots[index], createItem(Material.MAP, continent.getName()));
            index++;
        }

        inventory.setItem(49, createItem(Material.FEATHER, "Organizations"));
    }

    @Override
    public void open(Player player) {
        player.openInventory(inventory);
    }
}
