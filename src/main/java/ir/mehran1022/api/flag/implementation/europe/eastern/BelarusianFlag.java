package ir.mehran1022.api.flag.implementation.europe.eastern;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BelarusianFlag extends Flag {

    public BelarusianFlag() {
        super("Belarus", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Belarusian Flag", Arrays.asList(
                "Belarus’ flag features red and green vertical halves",
                "with white triangles at the top, symbolizing",
                "the country’s independence and heritage, adopted in 1995."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLES_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLES_TOP)
            ));
            banner.setItemMeta(meta);
        }
    }
}
