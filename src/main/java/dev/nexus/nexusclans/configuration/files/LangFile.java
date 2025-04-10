package dev.nexus.nexusclans.configuration.files;

import ch.jalu.configme.Comment;
import ch.jalu.configme.SettingsHolder;
import ch.jalu.configme.properties.Property;

import static ch.jalu.configme.properties.PropertyInitializer.newProperty;

public class LangFile implements SettingsHolder {

    @Comment("Prefixes")
    public static final Property<String> CLAN_MESSAGE_PREFIX = newProperty("settings.clan_prefix", "&e[&d&lNexus&b&lClans] ");
    public static final Property<String> ERROR_MESSAGE_PREFIX = newProperty("settings.error_prefix", "&c[&4&l!&c] ");

    @Comment("Clan messages")
    public static final Property<String> CLAN_JOIN_MESSAGE = newProperty("clan.join", CLAN_MESSAGE_PREFIX +"&b{player} joined the clan!");
    public static final Property<String> CLAN_LEAVE_MESSAGE = newProperty("clan.leave", CLAN_MESSAGE_PREFIX +"&b{player} left the clan! :(");
    public static final Property<String> CLAN_KICK_MESSAGE = newProperty("clan.kick", CLAN_MESSAGE_PREFIX +"&b{player} got kicked from the clan!");
    public static final Property<String> CLAN_DISBAND_MESSAGE = newProperty("clan.disband", CLAN_MESSAGE_PREFIX +"&c[!] &eThe clan {clan} got disbanded!");

    @Comment("Player messages")
    public static final Property<String> CLAN_PLAYER_INVITE_MESSAGE = newProperty("clan.player.invite", CLAN_MESSAGE_PREFIX + "&bYou got invited in the clan &3{clan}!");
    public static final Property<String> CLAN_PLAYER_JOIN_MESSAGE = newProperty("clan.player.join", CLAN_MESSAGE_PREFIX +"&eYou got kicked from the clan {clan}.");
    public static final Property<String> CLAN_PLAYER_LEAVE_MESSAGE = newProperty("clan.player.leave", CLAN_MESSAGE_PREFIX +"&b{player} left the clan!");
    public static final Property<String> CLAN_PLAYER_KICK_MESSAGE = newProperty("clan.player.kick", CLAN_MESSAGE_PREFIX +"&b{player} got kicked from the clan!");

    @Comment("Errors")
    public static final Property<String> CLAN_NOT_FOUND_MESSAGE = newProperty("clan.notfound", CLAN_MESSAGE_PREFIX + "&cThe clan {clan} does not exist!");
    public static final Property<String> CLAN_ALREADY_EXISTS_MESSAGE = newProperty("clan.alreadyexists", CLAN_MESSAGE_PREFIX + "&cThe clan {clan} already exists!");
    public static final Property<String> CLAN_PLAYER_NOT_IN_CLAN_MESSAGE = newProperty("clan.player.notin", CLAN_MESSAGE_PREFIX + "&cPlayer {player} is not in any clan!");
    public static final Property<String> CLAN_PLAYER_ALREADY_IN_CLAN_MESSAGE = newProperty("clan.player.alreadyin", CLAN_MESSAGE_PREFIX + "&cPlayer {player} is already in a clan!");
    public static final Property<String> CLAN_INVITE_ALREADY_SENT_MESSAGE = newProperty("clan.invite.alreadysent", CLAN_MESSAGE_PREFIX + "&cAn invite to {player} has already been sent!");
    public static final Property<String> CLAN_PLAYER_BANNED_MESSAGE = newProperty("clan.player.banned", CLAN_MESSAGE_PREFIX + "&cPlayer {player} is banned from the clan!");
    public static final Property<String> CLAN_OWNER_CANNOT_LEAVE_MESSAGE = newProperty("clan.owner.cannotleave", CLAN_MESSAGE_PREFIX + "&cThe clan owner cannot leave the clan without transferring ownership!");
}
