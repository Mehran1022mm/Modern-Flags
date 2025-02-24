package ir.mehran1022.api.flag.implementation.europe.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class PortugueseFlag extends Flag {
    public PortugueseFlag() {
        super("Portugal", Material.RED_BANNER);
        applyDesign();
        setMeta("Portuguese Flag", Arrays.asList(
                "Portugal's flag features a red background with a green",
                "half-vertical stripe, a globe, and symbolic flowers,",
                "representing the country's heritage and history."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.YELLOW, PatternType.GLOBE),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
                    new Pattern(DyeColor.WHITE, PatternType.CIRCLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
