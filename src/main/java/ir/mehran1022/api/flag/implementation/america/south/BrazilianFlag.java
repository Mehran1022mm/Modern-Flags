package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BrazilianFlag extends Flag {

    public BrazilianFlag() {
        super("Brazil", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Brazilian Flag", Arrays.asList(
                "Brazil's flag features green and yellow patterns,",
                "with a blue circle, symbolizing national unity and",
                "progress. Adopted in 1889, it represents Brazil’s",
                "rich culture and natural beauty."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.HALF_HORIZONTAL),
                    new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS),
                    new Pattern(DyeColor.GREEN, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.YELLOW, PatternType.RHOMBUS),
                    new Pattern(DyeColor.BLUE, PatternType.CIRCLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
