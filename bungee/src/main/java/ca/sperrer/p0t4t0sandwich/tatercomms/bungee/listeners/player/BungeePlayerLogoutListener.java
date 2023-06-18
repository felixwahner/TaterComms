package ca.sperrer.p0t4t0sandwich.tatercomms.bungee.listeners.player;

import ca.sperrer.p0t4t0sandwich.tatercomms.bungee.player.BungeeTaterPlayer;
import ca.sperrer.p0t4t0sandwich.tatercomms.common.listeners.player.PlayerLogoutListener;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;
import net.md_5.bungee.event.EventPriority;

import static ca.sperrer.p0t4t0sandwich.tatercomms.common.Utils.runTaskAsync;

/**
 * Listens for player logouts and sends them to the message relay.
 */
public class BungeePlayerLogoutListener implements Listener, PlayerLogoutListener {
    /**
     * Called when a player logs out.
     * @param event The event.
     */
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogout(PlayerDisconnectEvent event) {
        runTaskAsync(() -> {
            try {
                // Pass TaterPlayer to helper function
                taterPlayerLogout(new BungeeTaterPlayer(event.getPlayer()));
            } catch (Exception e) {
                System.err.println(e);
                e.printStackTrace();
            }
        });
    }
}