package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class IranianFlag extends Flag {

    public IranianFlag() {
        super("Iran", Material.WHITE_BANNER);
        applyDesign();
        setMeta("* Iranian Flag", Arrays.asList(
                "Iran's flag features green, white, and red,",
                "symbolizing Islam, peace, and courage.",
                "The central emblem represents the nation's ideals."
        ), ChatColor.DARK_RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.LIME, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.LIME, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}