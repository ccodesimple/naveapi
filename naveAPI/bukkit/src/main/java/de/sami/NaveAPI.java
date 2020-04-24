package de.sami;

/*
24.04.2020
15:22
©created 2020 by sami
*/

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NaveAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("NAVEAPI Bukkit hat geladen");
    }

}
