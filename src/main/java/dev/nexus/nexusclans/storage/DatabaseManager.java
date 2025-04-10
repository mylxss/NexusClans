package dev.nexus.nexusclans.storage;

import dev.nexus.nexusclans.NexusClans;
import dev.nexus.nexusclans.configuration.files.ConfigFile;
import dev.nexus.nexusclans.storage.impl.MongoStorage;
import dev.nexus.nexusclans.storage.impl.MySQLStorage;
import dev.nexus.nexusclans.storage.impl.SQLiteStorage;

import java.io.File;

public class DatabaseManager {

    private final StorageHandler storageHandler;

    public DatabaseManager(File dataFolder) {
        StorageType storageType = NexusClans.getInstance().getConfiguration().getProperty(ConfigFile.STORAGE_TYPE);

        StorageHandler handlerToUse = null;

        try {
            handlerToUse = createHandler(storageType);
            handlerToUse.connect();
            System.out.println("[Storage] Connected using " + storageType.name());
        } catch (Exception e) {
            System.out.println("[Storage] Failed to connect using " + storageType.name() + ": " + e.getMessage());
            System.out.println("[Storage] Falling back to SQLite...");

            try {
                handlerToUse = new SQLiteStorage();
                handlerToUse.connect();
                System.out.println("[Storage] Connected using fallback: SQLITE");
            } catch (Exception fallbackEx) {
                System.out.println("[Storage] FATAL: Failed to connect to SQLite as fallback!");
                fallbackEx.printStackTrace();
                throw new RuntimeException("No available storage backend could be initialized.");
            }
        }

        this.storageHandler = handlerToUse;
    }

    private StorageHandler createHandler(StorageType type) {
        switch (type) {
            case MYSQL:
                return new MySQLStorage();
            case MONGODB:
                return new MongoStorage();
            case SQLITE:
                return new SQLiteStorage();
            default:
                throw new IllegalArgumentException("Unsupported storage type: " + type);
        }
    }

    public void shutdown() {
        if (storageHandler != null) {
            storageHandler.disconnect();
        }
    }

    public StorageHandler getStorageHandler() {
        return storageHandler;
    }
}

