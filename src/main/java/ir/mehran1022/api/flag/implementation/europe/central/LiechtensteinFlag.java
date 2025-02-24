package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class LiechtensteinFlag extends Flag {

    public LiechtensteinFlag() {
        super("Liechtenstein", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Liechtenstein's Flag", Arrays.asList(
                "Liechtenstein's flag features blue and red horizontal",
                "stripes, with a yellow square in the top-right corner,",
                "symbolizing the country's royal heritage and independence."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.SQUARE_TOP_RIGHT),
                    new Pattern(DyeColor.BLUE, PatternType.GRADIENT_UP),
                    new Pattern(DyeColor.BLUE, PatternType.BORDER),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL)
            ));
            banner.setItemMeta(meta);
        }
    }
}
