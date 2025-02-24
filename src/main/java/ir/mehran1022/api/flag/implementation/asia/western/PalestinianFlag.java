package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class PalestinianFlag extends Flag {

    public PalestinianFlag() {
        super("Palestine", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Palestinian Flag", Arrays.asList(
                "Palestine's flag features black, white, and green horizontal stripes,",
                "with a red triangle on the left, symbolizing Palestinian unity and resistance.",
                "The flag was adopted in 1964 and represents the national identity of Palestine."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.TRIANGLE_TOP)
            ));
            banner.setItemMeta(meta);
        }
    }
}