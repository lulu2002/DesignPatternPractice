package me.lulu.designpatternpratcie.adapter;

import org.bukkit.entity.Player;

public class PlayerAdapterImpl implements PlayerAdapter {
    private Player player;

    public PlayerAdapterImpl(Player player) {
        this.player = player;
    }

    @Override
    public String getRank() {
        return isOp() ? "BIG-STAFF" : "NORMAL";
    }

    private boolean isOp() {
        return false; //player.isOp(); 我很想這麼寫，可是在沒有 server 的情況下沒辦法XD
    }
}
