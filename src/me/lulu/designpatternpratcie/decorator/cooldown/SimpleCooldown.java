package me.lulu.designpatternpratcie.decorator.cooldown;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class SimpleCooldown implements net.naluwan.kitpvpaddon.cooldown.Cooldown {

    private Cache<UUID, Long> cooldowns;
    private int time;
    private TimeUnit timeUnit;

    public SimpleCooldown(int time, TimeUnit timeUnit) {
        this.cooldowns = CacheBuilder.newBuilder()
                .expireAfterWrite(time, timeUnit)
                .removalListener(removalNotification -> {
                    UUID uuid = ( UUID ) removalNotification.getKey();
                    Player player = Bukkit.getPlayer(uuid);

                    if (player != null)
                        end(player);
                })
                .build();

        this.time = time;
        this.timeUnit = timeUnit;
    }

    @Override
    public long getCooldownMilli(Player player) {
        Long millisPassed = cooldowns.getIfPresent(player.getUniqueId());
        long maxCooldown = timeUnit.toMillis(time);

        if (millisPassed == null) {
            return -1;
        }

        return maxCooldown - (System.currentTimeMillis() - millisPassed);
    }

    @Override
    public void addCooldown(Player player) {
        cooldowns.put(player.getUniqueId(), System.currentTimeMillis());
    }

    @Override
    public void removeCooldown(Player player) {
        cooldowns.invalidate(player.getUniqueId());
    }

    @Override
    public void end(Player player) {

    }
}
