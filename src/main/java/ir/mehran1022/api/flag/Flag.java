package ir.mehran1022.api.flag;

import ir.mehran1022.flags.util.Format;
import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Flag {

    protected static final Map<Country, ItemStack> cache = new HashMap<>();

    @Getter
    protected final String name;
    protected final ItemStack banner;

    public Flag(String name, Material bannerMaterial) {
        this.name = name;
        this.banner = new ItemStack(bannerMaterial);
    }

    protected void setMeta(String name, List<String> lore, ChatColor color) {
        ItemMeta meta = banner.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(color + name);
            meta.setLore(Format.colorize(lore));
            meta.addItemFlags(ItemFlag.HIDE_ADDITIONAL_TOOLTIP);
            banner.setItemMeta(meta);
        }
    }

    public static ItemStack getFlag(Country country) {
        return cache.get(country);
    }

    public ItemStack getBanner() {
        return banner.clone();
    }

    public static void registerAllCountries() {
        for (Country country : Country.values()) {
            Flag flag = country.createInstance();
            assert flag != null;
            cache.put(country, flag.getBanner());
        }
    }
}
