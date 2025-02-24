package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SwissFlag extends Flag {

    public SwissFlag() {
        super("Switzerland", Material.RED_BANNER);
        applyDesign();
        setMeta("Swiss Flag", Arrays.asList(
                "Switzerland’s flag, featuring a bold white cross on a red",
                "field, is one of the few square national flags, in",
                "use since the 19th century."
        ), ChatColor.WHITE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}
