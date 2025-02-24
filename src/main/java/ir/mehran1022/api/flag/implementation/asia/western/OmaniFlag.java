package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class OmaniFlag extends Flag {

    public OmaniFlag() {
        super("Oman", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Omani Flag", Arrays.asList(
                "Oman's flag consists of red, white, and green,",
                "symbolizing peace, strength, and the country’s prosperity.",
                "The flag also features a distinctive emblem."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.WHITE, PatternType.TRIANGLES_TOP),
                    new Pattern(DyeColor.RED, PatternType.SQUARE_TOP_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_CENTER)
            ));
            banner.setItemMeta(meta);
        }
    }
}