package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class IcelandFlag extends Flag {

    public IcelandFlag() {
        super("Iceland", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Iceland's Flag", Arrays.asList(
                "Iceland's flag features a blue background with white",
                "stripes and a red cross, symbolizing the country's",
                "heritage, adopted in 1944."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.STRAIGHT_CROSS),
                    new Pattern(DyeColor.RED, PatternType.STRAIGHT_CROSS)
            ));
            banner.setItemMeta(meta);
        }
    }
}
