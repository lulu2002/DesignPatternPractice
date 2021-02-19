package me.lulu.designpatternpratcie.adapter;

public class AdapterExecute {

    public static void main(String[] args) {
        PlayerAdapter adapter = new PlayerAdapterImpl(null);
        System.out.println(adapter.getRank());
    }

}

