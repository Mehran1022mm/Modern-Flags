package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class PeruvianFlag extends Flag {

    public PeruvianFlag() {
        super("Peru", Material.WHITE_BANNER);
        applyDesign();
        setMeta("Peruvian Flag", Arrays.asList(
                "Peru's flag features a vertical tribal of red and white,",
                "symbolizing the nation's struggle for independence and",
                "its commitment to peace and patriotism."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.WHITE, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_BOTTOM)
            ));
            banner.setItemMeta(meta);
        }
    }
}
