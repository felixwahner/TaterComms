package ca.sperrer.p0t4t0sandwich.tatercomms.common.listeners;

import ca.sperrer.p0t4t0sandwich.tatercomms.common.player.TaterPlayer;
import ca.sperrer.p0t4t0sandwich.tatercomms.common.relay.MessageRelay;

public class PlayerLogoutListener {
    public void taterPlayerLogout(TaterPlayer taterPlayer) {
        MessageRelay relay = MessageRelay.getInstance();

        // Add the TaterPlayer to the cache
        relay.removeTaterPlayerFromCache(taterPlayer.getUUID());

        // Relay the logout message
        relay.sendPlayerLogout(taterPlayer, taterPlayer.getServerName());
    }
}