package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class ArgentinianFlag extends Flag {

    public ArgentinianFlag() {
        super("Argentina", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Argentinian Flag", Arrays.asList(
                "The national flag of Argentina,",
                "featuring sky blue and white stripes,",
                "symbolizes the country's independence.",
                "Adopted in 1812, it was inspired by",
                "the colors of the Argentine cockade.",
                "Argentina, the eighth-largest country",
                "in the world, is known for its rich",
                "cultural heritage, literature, and",
                "significant influence in global football."
        ), ChatColor.AQUA);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.CIRCLE),
                    new Pattern(DyeColor.LIGHT_BLUE, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.LIGHT_BLUE, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
