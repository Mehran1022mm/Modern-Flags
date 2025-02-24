package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class ArmenianFlag extends Flag {

    public ArmenianFlag() {
        super("Armenia", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Armenian Flag", Arrays.asList(
                "Armenia’s flag consists of red, blue, and yellow,",
                "symbolizing its history, the sky, and national wealth,",
                "officially adopted in 1990."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}