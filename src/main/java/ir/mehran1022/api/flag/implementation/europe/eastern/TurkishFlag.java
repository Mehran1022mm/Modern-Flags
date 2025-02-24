package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class TurkishFlag extends Flag {

    public TurkishFlag() {
        super("Turkey", Material.RED_BANNER);
        applyDesign();
        setMeta("Turkish Flag", Arrays.asList(
                "Turkey’s flag features a red background with white",
                "symbols including a crescent and star, reflecting",
                "the country’s cultural and historical significance.",
                "Adopted in 1936, the flag embodies Turkish identity."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.CURLY_BORDER),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.CIRCLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}