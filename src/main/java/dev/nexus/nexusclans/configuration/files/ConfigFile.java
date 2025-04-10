package dev.nexus.nexusclans.configuration.files;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.properties.EnumProperty;
import ch.jalu.configme.properties.Property;
import dev.nexus.nexusclans.storage.StorageType;

import static ch.jalu.configme.properties.PropertyInitializer.newProperty;

public class ConfigFile implements SettingsHolder {

    public static final EnumProperty<StorageType> STORAGE_TYPE =
            new EnumProperty<>(StorageType.class, "database.type", StorageType.SQLITE);

    @Comment("MySQL Settings!")
    public static final Property<String> MYSQL_DATABASE = newProperty("database.mysql.database", "minecraft");
    public static final Property<String> MYSQL_USER = newProperty("database.mysql.user", "root");
    public static final Property<String> MYSQL_PASSWORD = newProperty("database.mysql.password", "changeme12!");
    public static final Property<Integer> MYSQL_PORT = newProperty("database.mysql.port", 3306);

    @Comment("MongoDB Settings!")
    public static final Property<String> MONGO_DATABASE = newProperty("database.mysql.database", "minecraft");
    public static final Property<String> MONGO_USER = newProperty("database.mysql.user", "root");
    public static final Property<String> MONGO_PASSWORD = newProperty("database.mysql.password", "changeme12!");
    public static final Property<Integer> MONGO_PORT = newProperty("database.mysql.port", 3306);

    //TODO: Aggiungere e sistemare le credenziali del mongodb
}
