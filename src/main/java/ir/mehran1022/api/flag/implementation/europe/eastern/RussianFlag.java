package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class RussianFlag extends Flag {

    public RussianFlag() {
        super("Russia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Russian Flag", Arrays.asList(
                "Russia’s flag consists of three horizontal stripes,",
                "white, blue, and red, symbolizing nobility, faith,",
                "and courage, officially adopted in 1991."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER)
            ));
            banner.setItemMeta(meta);
        }
    }
}