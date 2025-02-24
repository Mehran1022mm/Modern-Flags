package ir.mehran1022.api.flag.implementation.europe.baltic;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class EstonianFlag extends Flag {

    public EstonianFlag() {
        super("Estonia", Material.BLACK_BANNER);
        applyDesign();
        setMeta("Estonian Flag", Arrays.asList(
                "Estonia's flag features blue, black, and white stripes,",
                "symbolizing the country's independence and national pride."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
