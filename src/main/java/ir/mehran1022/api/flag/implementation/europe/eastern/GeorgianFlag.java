package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class GeorgianFlag extends Flag {

    public GeorgianFlag() {
        super("Georgia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Georgian Flag", Arrays.asList(
                "Georgia's flag features red crosses and white patterns,",
                "symbolizing the country's Christian heritage and national identity."
        ), ChatColor.WHITE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.CROSS),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.CURLY_BORDER),
                    new Pattern(DyeColor.WHITE, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.STRAIGHT_CROSS)
            ));
            banner.setItemMeta(meta);
        }
    }
}