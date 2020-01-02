package world.bentobox.chat;

import world.bentobox.bentobox.api.configuration.ConfigComment;
import world.bentobox.bentobox.api.configuration.ConfigEntry;
import world.bentobox.bentobox.api.configuration.ConfigObject;
import world.bentobox.bentobox.api.configuration.StoreAt;
import world.bentobox.bentobox.managers.RanksManager;

import java.util.Arrays;
import java.util.List;

/**
 * Contains the config settings for this addon.
 * @author Poslovitch
 */
@StoreAt(filename = "config.yml", path = "addons/Chat")
@ConfigComment("Configuration file for Chat [version].")
public class Settings implements ConfigObject {

    @ConfigEntry(path = "team-chat.gamemodes")
    private List<String> teamChatGamemodes = Arrays.asList("BSkyBlock", "AcidIsland", "CaveBlock", "SkyGrid");

    @ConfigComment("Default gamemode world used in non BentoBox worlds, empty to disable.")
    @ConfigEntry(path = "team-chat.default-world")
    private String teamChatDefaultWorld = "";

    @ConfigComment("Minimum rank for team chat.")
    @ConfigEntry(path = "team-chat.minimum-rank")
    private int teamChatMinimumRank = RanksManager.MEMBER_RANK;

    @ConfigComment("Log team chats to console.")
    @ConfigEntry(path = "team-chat.log")
    private boolean logTeamChats;

    @ConfigComment("Lists the gamemodes in which you want the Chat addon to be effective.")
    @ConfigEntry(path = "island-chat.gamemodes")
    private List<String> islandChatGamemodes = Arrays.asList("BSkyBlock", "AcidIsland", "CaveBlock", "SkyGrid");

    @ConfigComment("Log island chats to console.")
    @ConfigEntry(path = "island-chat.log")
    private boolean logIslandChats;



    public List<String> getTeamChatGamemodes() {
        return teamChatGamemodes;
    }

    public void setTeamChatGamemodes(List<String> teamChatGamemodes) {
        this.teamChatGamemodes = teamChatGamemodes;
    }

    public String getTeamChatDefaultWorld() {
        return teamChatDefaultWorld;
    }

    public void setTeamChatDefaultWorld(String teamChatDefaultWorld) {
        this.teamChatDefaultWorld = teamChatDefaultWorld;
    }

    public int getTeamChatMinimumRank() {
        return teamChatMinimumRank;
    }

    public void setTeamChatMinimumRank(int teamChatMinimumRank) {
        this.teamChatMinimumRank = teamChatMinimumRank;
    }

    public List<String> getIslandChatGamemodes() {
        return islandChatGamemodes;
    }

    public void setIslandChatGamemodes(List<String> islandChatGamemodes) {
        this.islandChatGamemodes = islandChatGamemodes;
    }

    /**
     * @return the logTeamChats
     */
    public boolean isLogTeamChats() {
        return logTeamChats;
    }

    /**
     * @param logTeamChats the logTeamChats to set
     */
    public void setLogTeamChats(boolean logTeamChats) {
        this.logTeamChats = logTeamChats;
    }

    /**
     * @return the logIslandChats
     */
    public boolean isLogIslandChats() {
        return logIslandChats;
    }

    /**
     * @param logIslandChats the logIslandChats to set
     */
    public void setLogIslandChats(boolean logIslandChats) {
        this.logIslandChats = logIslandChats;
    }
}
