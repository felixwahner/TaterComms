package ca.sperrer.p0t4t0sandwich.tatercomms.velocity.listeners.player;

import ca.sperrer.p0t4t0sandwich.tatercomms.common.listeners.player.PlayerLogoutListener;
import ca.sperrer.p0t4t0sandwich.tatercomms.velocity.player.VelocityTaterPlayer;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.connection.DisconnectEvent;

/**
 * Listens for player logout and sends it to the message relay.
 */
public class VelocityPlayerLogoutListener implements PlayerLogoutListener {
    /**
     * Called when a player logs out.
     * @param event The player logout event
     */
    @Subscribe
    public void onPlayerLogout(DisconnectEvent event) {
        // Pass TaterPlayer to helper function
        taterPlayerLogout(new VelocityTaterPlayer(event.getPlayer()));
    }
}
