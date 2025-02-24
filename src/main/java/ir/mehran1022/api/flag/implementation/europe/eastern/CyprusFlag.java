package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class CyprusFlag extends Flag {

    public CyprusFlag() {
        super("Cyprus", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Cyprus' Flag", Arrays.asList(
                "Cyprus' flag features white, green, and orange patterns,",
                "symbolizing the country's identity, culture, and history."
        ), ChatColor.WHITE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.FLOWER),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.WHITE, PatternType.CIRCLE),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.ORANGE, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.BORDER),
                    new Pattern(DyeColor.WHITE, PatternType.CURLY_BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}