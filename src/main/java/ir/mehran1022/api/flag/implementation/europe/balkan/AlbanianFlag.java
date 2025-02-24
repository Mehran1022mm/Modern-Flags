package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class AlbanianFlag extends Flag {

    public AlbanianFlag() {
        super("Albania", Material.RED_BANNER);
        applyDesign();
        setMeta("Albanian Flag", Arrays.asList(
                "The flag of Albania features a red background with",
                "a black rhombus and skull, symbolizing strength and",
                "the nation’s rich history, adopted in 1912."
        ), ChatColor.DARK_GRAY);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.BLACK, PatternType.RHOMBUS),
                    new Pattern(DyeColor.BLACK, PatternType.SKULL),
                    new Pattern(DyeColor.RED, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.BLACK, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.BLACK, PatternType.STRIPE_MIDDLE)
            ));
            banner.setItemMeta(meta);
        }
    }
}
