package me.lulu.designpatternpratcie.factory.database;

import me.lulu.designpatternpratcie.factory.PlayerCache;

public interface PlayerCacheDatabase {

    void init();

    PlayerCache get(String playerName);

    void set(PlayerCache playerCache);

}
