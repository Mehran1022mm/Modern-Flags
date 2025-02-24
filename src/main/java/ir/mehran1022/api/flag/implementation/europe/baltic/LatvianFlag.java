package ir.mehran1022.api.flag.implementation.europe.baltic;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class LatvianFlag extends Flag {

    public LatvianFlag() {
        super("Latvia", Material.BLACK_BANNER);
        applyDesign();
        setMeta("Latvian Flag", Arrays.asList(
                "Latvia's flag features red gradients with a white stripe",
                "in the center, representing the country's independence"
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.GRADIENT_UP),
                    new Pattern(DyeColor.BLACK, PatternType.GRADIENT),
                    new Pattern(DyeColor.RED, PatternType.GRADIENT),
                    new Pattern(DyeColor.WHITE, PatternType.STRIPE_CENTER)
            ));
            banner.setItemMeta(meta);
        }
    }
}
