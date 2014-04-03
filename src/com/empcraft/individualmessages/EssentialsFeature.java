package com.empcraft.individualmessages;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;

import com.earth2me.essentials.Essentials;

public class EssentialsFeature  implements Listener {
	Plugin essentialsPlugin;
	IndividualMessages plugin;
    public EssentialsFeature() {
    }
    public String displayName(String name) {
    	Essentials ess = (Essentials) Bukkit.getPluginManager().getPlugin("Essentials");
        return ess.getUser(name)._getNickname();
    }
}
