package dev.nexus.nexusclans.configuration;

import ch.jalu.configme.SettingsHolder;
import dev.nexus.nexusclans.configuration.files.ConfigFile;
import dev.nexus.nexusclans.configuration.files.LangFile;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ConfigurationType {

    CONFIG("config.yml", true, "", ConfigFile.class),
    LANG("language.yml", true, "", LangFile.class);

    private final String fileName;
    private final boolean reloadable;

    private final String path;

    private final Class<? extends SettingsHolder> clazz;

}
