package me.lulu.designpatternpratcie.decorator.cooldown;

import org.bukkit.entity.Player;

import java.util.concurrent.TimeUnit;

public interface Cooldown {

    long getCooldownMilli(Player player);

    void addCooldown(Player player);

    void removeCooldown(Player player);

    void end(Player player);

    default boolean isInCooldown(Player player) {
        return getCooldownMilli(player) > 0;
    }

    default long getCooldownInSecond(Player player) {
        return TimeUnit.MILLISECONDS.toSeconds(getCooldownMilli(player));
    }
}
