package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class HungarianFlag extends Flag {

    public HungarianFlag() {
        super("Hungary", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Hungarian Flag", Arrays.asList(
                "Hungary’s flag features red, white, and green horizontal",
                "stripes, symbolizing strength, peace, and hope,",
                "adopted in 1957."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
