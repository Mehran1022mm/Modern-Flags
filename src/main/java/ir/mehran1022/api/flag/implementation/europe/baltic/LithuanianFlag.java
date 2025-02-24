package ir.mehran1022.api.flag.implementation.europe.baltic;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class LithuanianFlag extends Flag {

    public LithuanianFlag() {
        super("Lithuania", Material.GREEN_BANNER);
        applyDesign();
        setMeta("Lithuanian Flag", Arrays.asList(
                "Lithuania's flag features green, yellow, and red stripes,",
                "representing the country's national identity and pride."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
