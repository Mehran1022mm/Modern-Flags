package ir.mehran1022.api.flag.implementation.europe.balkan;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class MontenegroFlag extends Flag {

    public MontenegroFlag() {
        super("Montenegro", Material.RED_BANNER);
        applyDesign();
        setMeta("Montenegro's Flag", Arrays.asList(
                "Montenegro's flag features red and yellow patterns,",
                "with a skull, flower, and border symbolizing the country's",
                "rich cultural heritage and national pride."
        ), ChatColor.RED);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.YELLOW, PatternType.SKULL),
                    new Pattern(DyeColor.RED, PatternType.HALF_HORIZONTAL),
                    new Pattern(DyeColor.YELLOW, PatternType.FLOWER),
                    new Pattern(DyeColor.RED, PatternType.TRIANGLE_TOP),
                    new Pattern(DyeColor.YELLOW, PatternType.BORDER)
            ));
            banner.setItemMeta(meta);
        }
    }
}
