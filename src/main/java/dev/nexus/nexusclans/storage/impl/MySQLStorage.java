package dev.nexus.nexusclans.storage.impl;

import dev.nexus.nexusclans.storage.StorageHandler;

public class MySQLStorage implements StorageHandler {

    @Override
    public void connect() {
        System.out.println("Connected to MySQL.");
        // Da implementare!
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected from MySQL.");
        // database.close();
    }
}

