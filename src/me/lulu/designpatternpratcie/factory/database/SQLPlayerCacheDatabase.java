package me.lulu.designpatternpratcie.factory.database;

import me.lulu.designpatternpratcie.factory.PlayerCache;

public class SQLPlayerCacheDatabase implements PlayerCacheDatabase {

    @Override
    public void init() {
        System.out.println("SQL db connected!");
    }

    @Override
    public PlayerCache get(String playerName) {
        System.out.println("Getting cache from sql");
        return new PlayerCache();
    }

    @Override
    public void set(PlayerCache playerCache) {
        System.out.println("Saving cache to sql...");
    }
}
