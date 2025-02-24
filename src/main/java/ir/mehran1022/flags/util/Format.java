package ir.mehran1022.flags.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public final class Format {

    public final String PREFIX = "[Modern-Flags]";

    public List<String> colorize(List<String> lines) {
        if (lines == null) return List.of();
        return lines.stream()
                .map(Format::colorize)
                .collect(Collectors.toList());
    }

    public String colorize(String line) {
        if (line == null) return "";
        return ChatColor.translateAlternateColorCodes('&', line);
    }
}
