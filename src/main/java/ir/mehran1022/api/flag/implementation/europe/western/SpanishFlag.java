package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SpanishFlag extends Flag {

    public SpanishFlag() {
        super("Spain", Material.YELLOW_BANNER);
        applyDesign();
        setMeta("Spanish Flag", Arrays.asList(
                "Spain’s flag has red and yellow horizontal stripes,",
                "a design linked to its maritime and royal history,",
                "officially adopted in 1785."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BROWN, PatternType.MOJANG),
                    new Pattern(DyeColor.BROWN, PatternType.FLOWER),
                    new Pattern(DyeColor.YELLOW, PatternType.HALF_HORIZONTAL_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}