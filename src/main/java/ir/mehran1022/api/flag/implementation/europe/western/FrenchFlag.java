package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class FrenchFlag extends Flag {

    public FrenchFlag() {
        super("France", Material.WHITE_BANNER);
        applyDesign();
        setMeta("French Flag", Arrays.asList(
                "France’s flag displays blue, white, and red vertical",
                "stripes, representing liberty, equality, and fraternity,",
                "a national symbol since 1794."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
