package me.lulu.designpatternpratcie.decorator.request;

import me.lulu.designpatternpratcie.decorator.cooldown.Cooldown;
import me.lulu.designpatternpratcie.decorator.cooldown.SimpleCooldown;
import org.bukkit.entity.Player;

import java.util.concurrent.TimeUnit;

public class RequestCooldownDecorator extends AbstractRequestDecorator {

    private Cooldown cooldown;

    public RequestCooldownDecorator(Request request, int seconds) {
        super(request);

        cooldown = new SimpleCooldown(seconds, TimeUnit.SECONDS);
    }

    @Override
    protected void onSend(Player sender, Player toSend) {
        if (cooldown.isInCooldown(sender))
            Messenger.sendCooldown(sender, cooldown);
        else {
            super.onSend(sender, toSend);
            cooldown.addCooldown(sender);
        }
    }
}
