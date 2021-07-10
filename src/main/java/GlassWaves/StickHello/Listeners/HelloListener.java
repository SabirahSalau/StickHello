package GlassWaves.StickHello.Listeners;

import GlassWaves.StickHello.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class HelloListener implements Listener
{
    private Main plugin;

    public HelloListener(Main plugin)
    {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void stickEvent(PlayerInteractEvent event)
    {
        Player p = event.getPlayer();
        Material mat = event.getItem().getType();

        if(mat == Material.STICK)
        {
            p.sendMessage("I see you playing with sticks >:D");
        }

    }
}
