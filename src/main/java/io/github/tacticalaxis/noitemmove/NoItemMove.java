package io.github.tacticalaxis.noitemmove;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.java.JavaPlugin;

public class NoItemMove extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void move(InventoryPickupItemEvent event) {
        if (event.getInventory().getType() == InventoryType.HOPPER) {
            event.setCancelled(true);
        }
    }
}
