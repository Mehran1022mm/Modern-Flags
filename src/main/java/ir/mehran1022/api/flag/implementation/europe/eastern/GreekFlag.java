package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class GreekFlag extends Flag {

    public GreekFlag() {
        super("Greece", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Greek Flag", Arrays.asList(
                "Greece's flag features blue and white colors,",
                "symbolizing the country's history and independence,",
                "adopted in 1822."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.BLUE, PatternType.SQUARE_TOP_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}