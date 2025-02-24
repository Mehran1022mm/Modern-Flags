package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class MacedonianFlag extends Flag {

    public MacedonianFlag() {
        super("Macedonia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Macedonian Flag", Arrays.asList(
                "Macedonia's flag features red and yellow patterns,",
                "with a cross and rhombus symbolizing the country's",
                "historical significance and national identity."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.HALF_HORIZONTAL),
                    new Pattern(DyeColor.RED, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.YELLOW, PatternType.CROSS),
                    new Pattern(DyeColor.YELLOW, PatternType.STRAIGHT_CROSS),
                    new Pattern(DyeColor.RED, PatternType.RHOMBUS),
                    new Pattern(DyeColor.YELLOW, PatternType.CIRCLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
