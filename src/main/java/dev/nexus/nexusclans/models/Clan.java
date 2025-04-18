package dev.nexus.nexusclans.models;

public class Clan {
    private final int id;
    private final String name;

    public Clan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

