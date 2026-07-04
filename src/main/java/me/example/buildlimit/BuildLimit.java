package me.example.buildlimit;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BuildLimit extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("BuildLimit enabled!");
    }

    @EventHandler
    public void onPlace(BlockPlaceEvent event) {
        Material type = event.getBlock().getType();

        if (type != Material.COBWEB && type != Material.OAK_PLANKS) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBreak(BlockBreakEvent event) {
        Material type = event.getBlock().getType();

        if (type != Material.COBWEB && type != Material.OAK_PLANKS) {
            event.setCancelled(true);
        }
    }
}