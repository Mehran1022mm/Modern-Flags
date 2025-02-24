package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class YemeneseFlag extends Flag {

    public YemeneseFlag() {
        super("Yemen", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Yemen Flag", Arrays.asList(
                "Yemen’s flag features three horizontal stripes in red, white, and black.",
                "Adopted in 1990, it symbolizes unity and Arab nationalism."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_RIGHT),
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}