package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class RomanianFlag extends Flag {

    public RomanianFlag() {
        super("Romania", Material.YELLOW_BANNER);
        applyDesign();
        setMeta("Romanian Flag", Arrays.asList(
                "Romania’s flag features blue, yellow, and red vertical",
                "stripes, representing the country's regions and history,",
                "adopted in 1866."
        ), ChatColor.YELLOW);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}