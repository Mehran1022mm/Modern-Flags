package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class GermanFlag extends Flag {

    public GermanFlag() {
        super("Germany", Material.RED_BANNER);
        applyDesign();
        setMeta("German Flag", Arrays.asList(
                "Germany’s flag features black, red, and gold horizontal",
                "stripes, reflecting national unity and democracy,",
                "reinstated in 1949."
        ), ChatColor.DARK_RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
