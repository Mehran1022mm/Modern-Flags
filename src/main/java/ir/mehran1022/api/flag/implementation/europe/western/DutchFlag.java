package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class DutchFlag extends Flag {

    public DutchFlag() {
        super("Netherlands", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Dutch Flag", Arrays.asList(
                "Netherlands’ flag consists of red, white, and blue",
                "horizontal stripes, recognized as the oldest",
                "tricolor in continuous use since 1579."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
