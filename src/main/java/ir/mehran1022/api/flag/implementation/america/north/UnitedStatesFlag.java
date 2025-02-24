package ir.mehran1022.api.flag.implementation.america.north;

import ir.mehran1022.api.flag.Flag;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.block.banner.Pattern;
import org.bukkit.block.banner.PatternType;
import org.bukkit.inventory.meta.BannerMeta;

import java.util.Arrays;

public final class UnitedStatesFlag extends Flag {

    public UnitedStatesFlag() {
        super("United States of America", Material.RED_BANNER);
        applyDesign();
        setMeta("The USA's Flag", Arrays.asList(
                "The USA flag consists of red and white stripes,",
                "with a blue canton in the top left, symbolizing",
                "the union of states, adopted in 1777."
        ), ChatColor.BLUE);
    }

    private void applyDesign() {
        BannerMeta meta = (BannerMeta) banner.getItemMeta();
        if (meta != null) {
            meta.setPatterns(Arrays.asList(
                    new Pattern(DyeColor.WHITE, PatternType.SMALL_STRIPES),
                    new Pattern(DyeColor.BLUE, PatternType.SQUARE_TOP_LEFT)
            ));
            banner.setItemMeta(meta);
        }
    }
}

