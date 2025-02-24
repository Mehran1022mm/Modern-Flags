package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BulgarianFlag extends Flag {

    public BulgarianFlag() {
        super("Bulgaria", Material.GREEN_BANNER);
        applyDesign();
        setMeta("Bulgarian Flag", Arrays.asList(
                "Bulgaria’s flag features white, green, and red",
                "horizontal stripes, symbolizing peace, nature,",
                "and bravery, adopted in 1879."
        ), ChatColor.WHITE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
