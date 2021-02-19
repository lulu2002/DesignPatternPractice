package me.lulu.designpatternpratcie.proxy;

public class ProxyExecute {

    public static void main(String[] args) {
        DatabaseProxy proxy = new DatabaseProxy();

        System.out.println(proxy.getAllData());
        System.out.println(proxy.getAllData());
        System.out.println(proxy.getAllData());
        System.out.println(proxy.getAllData());
    }

}
