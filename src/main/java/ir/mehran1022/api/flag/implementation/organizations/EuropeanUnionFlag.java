package ir.mehran1022.api.flag.implementation.organizations;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class EuropeanUnionFlag extends Flag {

    public EuropeanUnionFlag() {
        super("European Union", Material.BLUE_BANNER);
        applyDesign();
        setMeta("European Union's Flag", Arrays.asList(
                "The European Union's flag features a blue background",
                "with a yellow flower symbol, a blue cross and circle,",
                "and a blue border, representing unity and integration."
        ), ChatColor.YELLOW);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
                    new Pattern(DyeColor.BLUE, PatternType.CROSS),
                    new Pattern(DyeColor.BLUE, PatternType.CIRCLE),
                    new Pattern(DyeColor.BLUE, PatternType.BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}
