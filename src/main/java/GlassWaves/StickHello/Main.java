package GlassWaves.StickHello;

import GlassWaves.StickHello.Listeners.HelloListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        new HelloListener(this);
    }
}
