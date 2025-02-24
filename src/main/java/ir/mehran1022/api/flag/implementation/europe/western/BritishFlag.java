package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BritishFlag extends Flag {

    public BritishFlag() {
        super("United Kingdom", Material.BLUE_BANNER);
        applyDesign();
        setMeta("British Flag", Arrays.asList(
                "The United Kingdom’s flag, known as the Union Jack,",
                "combines crosses of England, Scotland, and Ireland,",
                "in use since 1801."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNLEFT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNRIGHT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNLEFT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNRIGHT),
                    new Pattern(DyeColor.RED, PatternType.CROSS),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.STRAIGHT_CROSS)
            ));
            banner.setItemMeta(meta);
        }
    }
}
