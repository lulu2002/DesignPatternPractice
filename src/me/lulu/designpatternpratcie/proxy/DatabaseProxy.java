package me.lulu.designpatternpratcie.proxy;

public class DatabaseProxy implements Database {

    private static Database database;

    @Override
    public String[] getAllData() {
        if (database == null)
            database = new SqlDatabase();

        return database.getAllData();
    }
}
