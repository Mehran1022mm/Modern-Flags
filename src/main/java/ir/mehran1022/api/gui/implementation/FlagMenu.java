package ir.mehran1022.api.gui.implementation;

import ir.mehran1022.api.flag.Country;
import ir.mehran1022.api.flag.Flag;
import ir.mehran1022.api.flag.Continent;
import ir.mehran1022.api.gui.Menu;
import ir.mehran1022.flags.util.Format;
import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

@Getter
public final class FlagMenu extends Menu {

    private final Continent continent;
    private final int page;

    public FlagMenu(Continent continent, int page) {
        super(String.format("&b%s &7- &bPage %s", continent.getName(), page++), 54);
        this.continent = continent;
        this.page = page;
        addFlags();
        addNavigationButtons();
    }

    private void addFlags() {
        List<Country> countries = continent.getCountries();
        int startIndex = page * 28;
        int endIndex = Math.min(startIndex + 28, countries.size());
        int slot = 10;

        for (int i = startIndex; i < endIndex; i++) {
            Country country = countries.get(i);
            ItemStack flag = Flag.getFlag(country);
            inventory.setItem(slot++, flag);
            if (slot % 9 == 8) slot += 2;
        }
    }

    private void addNavigationButtons() {
        if (page > 0) inventory.setItem(45, createItem(Material.ARROW, Format.colorize("&a⬅ Previous Page")));
        if ((page + 1) * 28 < continent.getCountries().size()) {
            inventory.setItem(53, createItem(Material.ARROW, Format.colorize("&a➡ Next Page")));
        }

        inventory.setItem(49, createItem(Material.POLISHED_BLACKSTONE_BUTTON, Format.colorize("&c↻ Back to Continent Menu")));
    }


    @Override
    public void open(Player player) {
        player.openInventory(inventory);
    }
}
