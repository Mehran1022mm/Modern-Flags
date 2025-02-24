package ir.mehran1022.api.flag.implementation.europe.scandinavian;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class DanishFlag extends Flag {

    public DanishFlag() {
        super("Denmark", Material.RED_BANNER);
        applyDesign();
        setMeta("Danish Flag", Arrays.asList(
                "Denmark’s flag, known as the Dannenberg, features a white",
                "Nordic cross on red, recognized as the world’s oldest",
                "national flag in continuous use since 1219."
        ), ChatColor.WHITE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRAIGHT_CROSS),
                    new Pattern(DyeColor.WHITE, PatternType.STRAIGHT_CROSS)
            ));
            banner.setItemMeta(meta);
        }
    }
}
