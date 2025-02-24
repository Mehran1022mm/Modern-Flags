package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class KosovanFlag extends Flag {

    public KosovanFlag() {
        super("Kosovo", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Kosovan Flag", Arrays.asList(
                "Kosovo's flag features blue with various patterns, including",
                "stripes, flowers, and borders, symbolizing national unity",
                "and pride for the country."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.FLOWER),
                    new Pattern(DyeColor.BLUE, PatternType.BORDER),
                    new Pattern(DyeColor.BLUE, PatternType.CIRCLE),
                    new Pattern(DyeColor.BLUE, PatternType.PIGLIN),
                    new Pattern(DyeColor.BLUE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.YELLOW, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.BLUE, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.BLUE, PatternType.TRIANGLE_BOTTOM),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.BLUE, PatternType.CURLY_BORDER),
                    new Pattern(DyeColor.BLUE, PatternType.SQUARE_BOTTOM_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
