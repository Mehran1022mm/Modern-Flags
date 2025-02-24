package ir.mehran1022.flags.event;

import ir.mehran1022.api.flag.Continent;
import ir.mehran1022.api.gui.implementation.ContinentMenu;
import ir.mehran1022.api.gui.implementation.FlagMenu;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Objects;

public final class InventoryClickListener implements Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    public void onInventoryClick(InventoryClickEvent event) {
        if (!(event.getWhoClicked() instanceof Player player)) return;

        InventoryHolder holder = event.getInventory().getHolder();

        if(!(holder instanceof ContinentMenu || holder instanceof FlagMenu)) return;
        if (event.getCurrentItem() == null || event.getCurrentItem().getItemMeta() == null) return;

        ItemStack item = event.getCurrentItem();
        String itemName = ChatColor.stripColor(item.getItemMeta().getDisplayName());

        if (holder instanceof ContinentMenu) {
            event.setCancelled(true);
            handleContinentSelection(player, itemName);
        } else {
            FlagMenu flagMenu = (FlagMenu) holder;
            event.setCancelled(true);
            handleFlagSelection(player, item, flagMenu);
        }
    }

    private void handleContinentSelection(Player player, String itemName) {
        Continent selectedContinent = Continent.getByName(itemName);
        if (selectedContinent != null) {
            player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1, 1);
            new FlagMenu(selectedContinent, 0).open(player);
        }
    }

    private void handleFlagSelection(Player player, ItemStack item, FlagMenu flagMenu) {
        String itemName = ChatColor.stripColor(Objects.requireNonNull(item.getItemMeta()).getDisplayName());
        Continent continent = flagMenu.getContinent();
        int currentPage = flagMenu.getPage();

        if (item.getItemMeta() instanceof BannerMeta) {
            player.getInventory().addItem(item.clone());
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1, 1);
        } else if (itemName.equals("⬅ Previous Page") && currentPage > 0) {
            player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1, 1);
            new FlagMenu(continent, currentPage - 1).open(player);
        } else if (itemName.equals("➡ Next Page")) {
            player.playSound(player.getLocation(), Sound.UI_BUTTON_CLICK, 1, 1);
            new FlagMenu(continent, currentPage + 1).open(player);
        } else if (itemName.equals("↻ Back to Continent Menu")) {
            player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
            new ContinentMenu().open(player);
        }
    }
}