package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SlovenianFlag extends Flag {

    public SlovenianFlag() {
        super("Slovenia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Slovenian Flag", Arrays.asList(
                "Slovenia's flag features blue, white, and red stripes,",
                "with blue and white bricks, symbolizing the country's",
                "rich cultural heritage and national pride."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLUE, PatternType.BRICKS),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_HORIZONTAL),
                    new Pattern(DyeColor.WHITE, PatternType.BORDER),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.BLUE, PatternType.STRIPE_CENTER)
            ));
            banner.setItemMeta(meta);
        }
    }
}
