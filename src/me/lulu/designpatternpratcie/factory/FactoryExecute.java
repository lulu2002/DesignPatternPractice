package me.lulu.designpatternpratcie.factory;

import me.lulu.designpatternpratcie.factory.database.PlayerCacheDatabase;

public class FactoryExecute {

    public static void main(String[] args) throws Exception {
        PlayerCacheDatabase database = PlayerCacheDatabaseFactory.initDatabase(DatabaseType.SQL);
        database.init();
        database.get("Hello");
        database.set(new PlayerCache());
    }

}
