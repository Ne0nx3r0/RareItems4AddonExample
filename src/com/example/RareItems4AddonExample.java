package com.example;

import com.lonelymc.ri4.api.IRareItems4API;
import com.lonelymc.ri4.bukkit.RareItems4Plugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class RareItems4AddonExample extends JavaPlugin{
    private IRareItems4API api;

    public void onEnable(){
        RareItems4Plugin ri4 = (RareItems4Plugin) this.getServer().getPluginManager().getPlugin("RareItems4");

        if(ri4 != null){
            this.api = ri4.getAPI();

            api.addItemProperty(new ExampleItemProperty(this));
        }
    }
}
