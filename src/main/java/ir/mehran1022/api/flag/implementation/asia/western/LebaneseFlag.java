package ir.mehran1022.api.flag.implementation.asia.western;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class LebaneseFlag extends Flag {

    public LebaneseFlag() {
        super("Lebanon", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Lebanese Flag", Arrays.asList(
                "Lebanon's flag consists of red and white horizontal stripes,",
                "with a green cedar tree in the center, symbolizing peace and eternity.",
                "Adopted in 1943, it represents Lebanon's independence and heritage."
        ), ChatColor.GREEN);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_CENTER), // Cedar tree trunk
                    new Pattern(DyeColor.GREEN, PatternType.RHOMBUS),       // Tree foliage
                    new Pattern(DyeColor.GREEN, PatternType.SKULL),         // More tree details
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM),   // Bottom red stripe
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP)       // Top red stripe
            ));
            banner.setItemMeta(meta);
        }
    }
}