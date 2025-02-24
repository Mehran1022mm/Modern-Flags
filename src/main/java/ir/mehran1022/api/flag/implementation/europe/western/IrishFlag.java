package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class IrishFlag extends Flag {

    public IrishFlag() {
        super("Ireland", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Irish Flag", Arrays.asList(
                "Ireland’s flag has green, white, and orange stripes,",
                "symbolizing unity and peace between traditions,",
                "adopted in 1919."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.LIME, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.ORANGE, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
