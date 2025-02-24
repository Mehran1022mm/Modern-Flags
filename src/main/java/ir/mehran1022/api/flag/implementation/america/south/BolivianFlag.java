package ir.mehran1022.api.flag.implementation.america.south;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class BolivianFlag extends Flag {

    public BolivianFlag() {
        super("Bolivia", Material.YELLOW_BANNER);
        applyDesign();
        setMeta("Bolivian Flag", Arrays.asList(
                "Bolivia's flag features red, yellow, and green,",
                "symbolizing the nation's bravery, natural wealth,",
                "and the fertility of its land."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_MIDDLE),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.FLOWER),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_TOP),
                    new Pattern(DyeColor.YELLOW, PatternType.STRIPE_BOTTOM),
                    new Pattern(DyeColor.RED, PatternType.STRIPE_LEFT),
                    new Pattern(DyeColor.GREEN, PatternType.STRIPE_RIGHT)
            ));
            banner.setItemMeta(meta);
        }
    }
}
