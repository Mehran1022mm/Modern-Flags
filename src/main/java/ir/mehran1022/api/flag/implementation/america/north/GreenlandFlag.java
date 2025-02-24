package ir.mehran1022.api.flag.implementation.america.north;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class GreenlandFlag extends Flag {

    public GreenlandFlag() {
        super("Greenland", Material.RED_BANNER);
        applyDesign();
        setMeta("Greenland's Flag", Arrays.asList(
                "Greenland's flag features a red background with white",
                "stripes and borders, and red squares in the corners,",
                "symbolizing the country's heritage and independence."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.WHITE, PatternType.CURLY_BORDER),
                    new Pattern(DyeColor.RED, PatternType.SQUARE_TOP_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.SQUARE_BOTTOM_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}

