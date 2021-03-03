package me.lulu.designpatternpratcie.decorator.request;

import net.naluwan.common.IgnoreChecker;
import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;

public class RequestIgnDecorator extends AbstractRequestDecorator {

    public RequestIgnDecorator(Request request) {
        super(request);
    }

    @Override
    protected void onSend(Player sender, Player toSend) {
        if (IgnoreChecker.isIgnoringAnySide(sender, toSend))
            Common.tell(sender, "由於你在對方的黑名單中，因此邀請無法送出。");
        else
            super.onSend(sender, toSend);
    }
}
