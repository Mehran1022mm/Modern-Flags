package ir.mehran1022.api.flag.implementation.europe.scandinavian;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class NorwegianFlag extends Flag {

    public NorwegianFlag() {
        super("Norway", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Norwegian Flag", Arrays.asList(
                "Norway's flag features a red cross with a blue border",
                "on a white field, symbolizing its Scandinavian heritage,",
                "adopted in 1821."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.BLUE, PatternType.STRAIGHT_CROSS)
            ));
            banner.setItemMeta(meta);
        }
    }
}
