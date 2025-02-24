package ir.mehran1022.flags.command;

import ir.mehran1022.api.gui.implementation.ContinentMenu;
import ir.mehran1022.flags.util.Format;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public final class FlagsCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player player)) {
            sender.sendMessage(Format.colorize(String.format("&c %s You can't execute this command.", Format.PREFIX)));
            return true;
        }

        if (!player.hasPermission("modern-flags.use")) {
            player.sendMessage(Format.colorize(String.format("&c %s You don't have the requirements for this action.", Format.PREFIX)));
            player.playSound(player.getLocation(), Sound.ENTITY_VILLAGER_NO, 1, 1);
            return true;
        }

        new ContinentMenu().open(player);
        player.playSound(player.getLocation(), Sound.BLOCK_CHEST_OPEN, 1, 1);
        return true;
    }
}
