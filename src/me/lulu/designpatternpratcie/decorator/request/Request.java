package me.lulu.designpatternpratcie.decorator.request;

import org.bukkit.entity.Player;
import org.mineacademy.fo.Common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public abstract class Request {

    private HashMap<UUID, Set<UUID>> requests = new HashMap<>();

    public void send(Player sender, Player toSend) {
        if (sender == toSend) {
            Common.tell(sender, "&c你無法邀請自己。");
            return;
        }

        if (getRequestsSent(sender).contains(toSend.getUniqueId())) {
            Common.tell(sender, "&c你已經向這位玩家發送邀請了。");
            return;
        }

        if (checkSend(sender, toSend)) {
            getRequestsSent(sender).add(toSend.getUniqueId());
            onSend(sender, toSend);
        }
    }

    private Set<UUID> getRequestsSent(Player sender) {
        Set<UUID> uuids = requests.computeIfAbsent(sender.getUniqueId(), uuid -> new HashSet<>());
        return uuids;
    }

    protected abstract boolean checkSend(Player sender, Player toSend);

    protected abstract void onSend(Player sender, Player toSend);

    public void accept(Player player, Player sender) {
        Set<UUID> requestsSent = getRequestsSent(sender);

        if (!requestsSent.contains(player.getUniqueId())) {
            Common.tell(player, "&c此玩家並沒有發請給你邀請，或是邀請已過期。");
            return;
        }

        if (checkAccept(player, sender)) {
            onAccept(player, sender);
            clearRequests(sender);
        }
    }

    public void clearRequests(Player player) {
        requests.remove(player.getUniqueId());
    }

    protected abstract void onAccept(Player player, Player sender);

    protected abstract boolean checkAccept(Player player, Player sender);

}
