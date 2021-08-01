package com.github.zoidayo.spigot.signboardplugin;

import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventManager implements Listener {
    @EventHandler
    public void onClick(PlayerInteractEvent e){
        if (!e.hasBlock()) return;
        if(!(e.getClickedBlock().getState() instanceof Sign)) return;
        Sign sign = (Sign) e.getClickedBlock().getState();

        for (String str :
                sign.getLines()) {
            e.getPlayer().sendMessage(str);
        }
    }
}
