package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class SyrianFlag extends Flag {

    public SyrianFlag() {
        super("Syria", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Syria Flag", Arrays.asList(
                "Syria's flag features red, white, black, and green stripes,",
                "with two green stars symbolizing unity and the nation’s future.",
                "Adopted in 1980, it reflects Syria's heritage and aspirations."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.WHITE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}