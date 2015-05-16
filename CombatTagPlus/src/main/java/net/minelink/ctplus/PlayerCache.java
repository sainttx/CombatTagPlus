package net.minelink.ctplus;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class PlayerCache {

    private final Map<UUID, Player> uuidCache = new HashMap<>();

    private final Map<String, Player> nameCache = new HashMap<>();

    public void addPlayer(Player player) {
        uuidCache.put(player.getUniqueId(), player);
        nameCache.put(player.getName(), player);
    }

    public void removePlayer(Player player) {
        uuidCache.remove(player.getUniqueId());
        nameCache.remove(player.getName());
    }

    public boolean isOnline(UUID id) {
        return uuidCache.containsKey(id);
    }

    public boolean isOnline(String name) {
        return nameCache.containsKey(name);
    }

    public Player getPlayer(UUID id) {
        return uuidCache.get(id);
    }

    public Player getPlayer(String name) {
        return nameCache.get(name);
    }

}
