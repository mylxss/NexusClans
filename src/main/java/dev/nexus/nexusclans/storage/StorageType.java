package dev.nexus.nexusclans.storage;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StorageType {

    /**
     * Tipo di database, configrabile da config.yml :)
     */


    MYSQL("MySQL", true),
    MONGODB("MongoDB", true),
    SQLITE("SQLite", false);

    private final String displayName;
    private final boolean supportsRemote;

    /**
     * Controlla se il tipo di storage è basato su SQL.
     */
    public boolean isSql() {
        return this == MYSQL || this == SQLITE;
    }

    /**
     * Controlla se il tipo di storage è NoSQL.
     */
    public boolean isNoSql() {
        return this == MONGODB;
    }
}
