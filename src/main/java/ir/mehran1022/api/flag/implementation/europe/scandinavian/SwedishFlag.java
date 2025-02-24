package ir.mehran1022.api.flag.implementation.europe.scandinavian;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SwedishFlag extends Flag {

    public SwedishFlag() {
        super("Sweden", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Swedish Flag", Arrays.asList(
                "Sweden’s flag showcases a yellow Nordic cross on a blue",
                "field, inspired by Scandinavian heritage, in use",
                "since the 16th century."
        ), ChatColor.YELLOW);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_MIDDLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
