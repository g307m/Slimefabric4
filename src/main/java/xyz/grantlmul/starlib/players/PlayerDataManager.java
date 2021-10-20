package xyz.grantlmul.starlib.players;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.UUID;

public class PlayerDataManager {
    private static HashMap<UUID, HashMap<Identifier, Object>> temporaryData  = new HashMap<UUID, HashMap<Identifier, Object>>();
    public void saveTemporaryData(UUID playerId, HashMap<Identifier, Object> playerData) {

    }
    public HashMap<Identifier, Object> getTemporaryData(UUID playerId) {
        return temporaryData.get(playerId);
    }
}
