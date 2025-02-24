package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class ArabianFlag extends Flag {

    public ArabianFlag() {
        super("Saudi Arabia", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Saudi Arabian Flag", Arrays.asList(
                "Saudi Arabia's flag is green with white elements,",
                "symbolizing Islam, purity, and the nation's power.",
                "The sword represents justice and strength."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.BRICKS),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.GREEN, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.GREEN, PatternType.BORDER),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_CENTER),
                    new Pattern(DyeColor.GREEN, PatternType.CURLY_BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}