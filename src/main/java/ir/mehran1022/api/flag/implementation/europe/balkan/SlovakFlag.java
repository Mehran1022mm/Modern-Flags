package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SlovakFlag extends Flag {

    public SlovakFlag() {
        super("Slovakia", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Slovak Flag", Arrays.asList(
                "Slovakia's flag features blue, white, and red stripes with",
                "a floral symbol, representing the country's rich cultural",
                "history and national heritage."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNLEFT),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.BLUE, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
