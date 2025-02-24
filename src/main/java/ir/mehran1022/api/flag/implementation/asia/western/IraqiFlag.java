package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class IraqiFlag extends Flag {

    public IraqiFlag() {
        super("Iraq", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Iraqi Flag", Arrays.asList(
                "Iraq's flag features red, white, and black horizontal stripes.",
                "The green Arabic inscription 'Allahu Akbar' means 'God is the Greatest'.",
                "The flag was adopted in 2008, symbolizing Iraq's history and unity."
        ), ChatColor.RED);

    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.FLOWER),
                    new Pattern(DyeColor.WHITE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.WHITE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}