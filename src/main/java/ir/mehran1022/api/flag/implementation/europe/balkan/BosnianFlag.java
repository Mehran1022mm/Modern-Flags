package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BosnianFlag extends Flag {

    public BosnianFlag() {
        super("Bosnia", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Bosnian Flag", Arrays.asList(
                "Bosnia's flag features blue, yellow, and white patterns,",
                "representing the country's history, culture, and unity."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_DOWNLEFT),
                    new Pattern(DyeColor.BLUE, PatternType.BRICKS),
                    new Pattern(DyeColor.YELLOW, PatternType.DIAGONAL_UP_RIGHT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
