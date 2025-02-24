package ir.mehran1022.api.flag.implementation.america.north;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class CanadianFlag extends Flag {

    public CanadianFlag() {
        super("Canada", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Canadian Flag", Arrays.asList(
                "Canada’s flag features a red maple leaf on a white",
                "field with red stripes on each side, symbolizing",
                "unity and the nation’s natural beauty, adopted in 1965."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.CROSS),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.WHITE, PatternType.CURLY_BORDER),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.RED, PatternType.CIRCLE),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}

