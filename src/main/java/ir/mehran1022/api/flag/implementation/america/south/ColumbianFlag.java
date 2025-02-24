package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class ColumbianFlag extends Flag {

    public ColumbianFlag() {
        super("Columbia", Material.BLUE_BANNER);
        applyDesign();
        setMeta("Columbian Flag", Arrays.asList(
                "Colombia's flag features yellow, blue, and red,",
                "symbolizing prosperity, the ocean, and the blood",
                "shed for independence."
        ), ChatColor.YELLOW);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.BLUE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.YELLOW, PatternType.HALF_VERTICAL_RIGHT),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.BLUE, PatternType.HALF_VERTICAL),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
