package me.lulu.designpatternpratcie.proxy;

public class SqlDatabase implements Database {

    public SqlDatabase() {
        try {
            System.out.println("Initializing..");
            Thread.sleep(1000);
            System.out.println("Done!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String[] getAllData() {
        return new String[]{
                "LU__LU",
                "HELLO",
                "YES!"
        };
    }
}
