package ir.mehran1022.flags.util;

import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

@UtilityClass
public final class Logger {

    public void log(Level level, String message) {
        String formattedMessage = String.format("[%s] %s", level.getLabel(), level.getColor() + message);
        Bukkit.getLogger().info(formattedMessage);
    }

    public void info(String message) {
        log(Level.INFO, message);
    }

    public void error(String message, Exception exception) {
        log(Level.ERROR, message);
        if (exception != null) {
            for (StackTraceElement element : exception.getStackTrace()) {
                log(Level.ERROR, element.toString());
            }
        }
    }

    @Getter
    public enum Level {

        INFO(ChatColor.GREEN, "INFO"),
        ERROR(ChatColor.RED, "ERROR");

        private final ChatColor color;
        private final String label;

        Level(ChatColor color, String label) {
            this.color = color;
            this.label = label;
        }
    }
}
