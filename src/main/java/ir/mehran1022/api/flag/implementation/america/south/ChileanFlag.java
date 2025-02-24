package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class ChileanFlag extends Flag {

    public ChileanFlag() {
        super("Chile", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Chilean Flag", Arrays.asList(
                "Chile's flag consists of blue, white, and red,",
                "symbolizing the sky, the snow-capped Andes, and",
                "the country's independence and patriotism."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.DIAGONAL_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.RHOMBUS),
                    new Pattern(DyeColor.BLUE, PatternType.TRIANGLES_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL)
            ));
            banner.setItemMeta(meta);
        }
    }
}
