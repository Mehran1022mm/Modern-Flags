package ir.mehran1022.api.flag.implementation.europe.scandinavian;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class FinnishFlag extends Flag {

    public FinnishFlag() {
        super("Finland", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Finnish Flag", Arrays.asList(
                "Finland’s flag, a blue Nordic cross on white, represents",
                "the country’s lakes and snowy landscapes, officially",
                "adopted in 1918."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_MIDDLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
