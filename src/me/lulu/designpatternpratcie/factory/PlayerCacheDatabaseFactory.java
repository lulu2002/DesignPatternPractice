package me.lulu.designpatternpratcie.factory;

import me.lulu.designpatternpratcie.factory.database.PlayerCacheDatabase;
import me.lulu.designpatternpratcie.factory.database.SQLPlayerCacheDatabase;
import me.lulu.designpatternpratcie.factory.database.YamlPlayerCacheDatabase;

public class PlayerCacheDatabaseFactory {

    public static PlayerCacheDatabase initDatabase(DatabaseType type) throws Exception {
        switch (type) {
            case YAML:
                return new YamlPlayerCacheDatabase();
            case SQL:
                return new SQLPlayerCacheDatabase();
        }

        throw new Exception("Invaild Database type.");
    }

}
