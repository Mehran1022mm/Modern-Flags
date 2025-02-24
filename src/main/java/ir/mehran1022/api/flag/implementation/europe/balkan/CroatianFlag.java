package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class CroatianFlag extends Flag {

    public CroatianFlag() {
        super("Croatia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Croatian Flag", Arrays.asList(
                "Croatia’s flag features red, white, and blue stripes,",
                "with a red flower pattern symbolizing its cultural",
                "and historical heritage, officially adopted in 1991."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
