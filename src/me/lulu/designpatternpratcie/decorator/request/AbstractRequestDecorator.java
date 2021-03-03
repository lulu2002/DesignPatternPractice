package me.lulu.designpatternpratcie.decorator.request;

import org.bukkit.entity.Player;

public class AbstractRequestDecorator extends Request {

    protected Request request;

    public AbstractRequestDecorator(Request request) {
        this.request = request;
    }

    @Override
    protected boolean checkSend(Player sender, Player toSend) {
        return request.checkSend(sender, toSend);
    }

    @Override
    protected void onSend(Player sender, Player toSend) {
        request.onSend(sender, toSend);
    }

    @Override
    protected void onAccept(Player player, Player sender) {
        request.onAccept(player, sender);
    }

    @Override
    protected boolean checkAccept(Player player, Player sender) {
        return request.checkAccept(player, sender);
    }
}
