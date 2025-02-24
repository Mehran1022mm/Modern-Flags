package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SerbFlag extends Flag {

    public SerbFlag() {
        super("Serbia", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Serb Flag", Arrays.asList(
                "Serbia's flag features blue, white, and red stripes with",
                "a red flower pattern, symbolizing the country's identity",
                "and national heritage."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.BRICKS),
                    new Pattern(DyeColor.WHITE, PatternType.BRICKS),
                    new Pattern(DyeColor.BLUE, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
