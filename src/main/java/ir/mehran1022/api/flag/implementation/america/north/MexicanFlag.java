package ir.mehran1022.api.flag.implementation.america.north;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class MexicanFlag extends Flag {

    public MexicanFlag() {
        super("Mexico", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Mexican Flag", Arrays.asList(
                "Mexico’s flag features green, white, and red stripes,",
                "with a symbol of the eagle and snake in the center,",
                "representing the Aztec legend, adopted in 1821."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.BROWN, PatternType.CIRCLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}


