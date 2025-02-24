package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class IsraeliFlag extends Flag {

    public IsraeliFlag() {
        super("Israel", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Israeli Flag", Arrays.asList(
                "Israel's flag features blue and white stripes with a Star of David,",
                "representing the Jewish identity and heritage.",
                "The flag was officially adopted in 1948."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.FLOWER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.WHITE, PatternType.BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}