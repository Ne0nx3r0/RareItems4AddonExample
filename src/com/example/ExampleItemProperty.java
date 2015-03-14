package com.example;

import com.lonelymc.ri4.api.IRareItemProperty;
import com.lonelymc.ri4.api.ItemPropertyRarity;
import com.lonelymc.ri4.api.PropertyCostType;
import com.lonelymc.ri4.bukkit.rareitems.RareItemProperty;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

public class ExampleItemProperty extends RareItemProperty {
    private final RareItems4AddonExample plugin;

    public ExampleItemProperty(RareItems4AddonExample plugin) {
        super(
                "Some Property",
                "My property does ALL the things",
                ItemPropertyRarity.COMMON,
                PropertyCostType.COOLDOWN,
                1, //default cost or time in seconds between activation/cooldown
                2, // max level
                null // Or generate a recipe in-game using /ri recipe and paste the YML results here as new String[]{"line","line",etc...}
        );

        // Assuming you need access to your plugin, you do whatever you want in your constructor
        this.plugin = plugin;
    }

    @Override
    public boolean onInteracted(Player pInteracted, PlayerInteractEvent e, int level) {
        // take the cost of the item property
        if(e.hasBlock()){
            pInteracted.sendMessage("You clicked on a "+e.getClickedBlock().getType().name());
        }

        //take no cost, the item property was not activated
        return false;
    }
}
