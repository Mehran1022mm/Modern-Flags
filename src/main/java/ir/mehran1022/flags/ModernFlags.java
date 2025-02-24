package ir.mehran1022.flags;

import ir.mehran1022.api.flag.Flag;
import ir.mehran1022.flags.command.FlagsCommand;
import ir.mehran1022.flags.event.InventoryClickListener;
import ir.mehran1022.flags.util.Logger;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class ModernFlags extends JavaPlugin {

    @Override
    public void onEnable() {
        Flag.registerAllCountries();
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        Objects.requireNonNull(getCommand("modern-flags")).setExecutor(new FlagsCommand());
        Logger.info("The plugin has been enabled successfully!");
    }

    @Override
    public void onDisable() {
        // There's actually no need for this
    }
}
