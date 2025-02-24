package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class VenezuelanFlag extends Flag {

    public VenezuelanFlag() {
        super("Venezuela", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Venezuelan Flag", Arrays.asList(
                "Venezuela's flag features yellow, blue, and red,",
                "symbolizing wealth, independence, and courage.",
                "The diagonal design represents progress and unity."
        ), ChatColor.YELLOW);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLE_BOTTOM),
                    new Pattern(DyeColor.BLUE, PatternType.DIAGONAL_RIGHT),
                    new Pattern(DyeColor.BLUE, PatternType.DIAGONAL_UP_RIGHT),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
