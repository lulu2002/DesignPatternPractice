package me.lulu.designpatternpratcie.factory.database;

import me.lulu.designpatternpratcie.factory.PlayerCache;

public class YamlPlayerCacheDatabase implements PlayerCacheDatabase {

    @Override
    public void init() {
        System.out.println("Load yaml file....");
    }

    @Override
    public PlayerCache get(String playerName) {
        System.out.println("Getting cache from yaml file");
        return new PlayerCache();
    }

    @Override
    public void set(PlayerCache playerCache) {
        System.out.println("Set cache to yaml file path");
    }
}
