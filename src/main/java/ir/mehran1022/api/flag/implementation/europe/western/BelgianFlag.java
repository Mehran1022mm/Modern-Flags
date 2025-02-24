package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BelgianFlag extends Flag {

    public BelgianFlag() {
        super("Belgium", Material.YELLOW_BANNER);
        applyDesign();
        setMeta("Belgian Flag", Arrays.asList(
                "Belgium’s flag consists of black, yellow, and red",
                "vertical stripes, symbolizing the nation’s struggle",
                "for independence, adopted in 1831."
        ), ChatColor.GOLD);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
