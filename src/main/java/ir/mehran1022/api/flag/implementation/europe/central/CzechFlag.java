package ir.mehran1022.api.flag.implementation.europe.central;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class CzechFlag extends Flag {

    public CzechFlag() {
        super("Czech Republic", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Czech Flag", Arrays.asList(
                "The Czech Republic's flag features a blue triangle",
                "with red and white horizontal sections,",
                "symbolizing national identity since 1920."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
