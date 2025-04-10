package dev.nexus.nexusclans.models;

import java.util.UUID;

public class ClanPlayer {

    private final UUID uuid;
    private final String name;
    private final Clan clan;

    public ClanPlayer(UUID uuid, String name, Clan clan) {
        this.uuid = uuid;
        this.name = name;
        this.clan = clan;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Clan getClan() {
        return clan;
    }

}
