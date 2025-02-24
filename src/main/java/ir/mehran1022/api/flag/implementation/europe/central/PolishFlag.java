package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class PolishFlag extends Flag {

    public PolishFlag() {
        super("Poland", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Polish Flag", Arrays.asList(
                "Poland’s flag features a simple white and red color,",
                "reflecting the nation’s history and culture, officially",
                "adopted in 1919."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL)
            ));
            banner.setItemMeta(meta);
        }
    }
}
