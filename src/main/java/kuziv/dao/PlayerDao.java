package kuziv.dao;

import kuziv.entity.Player;

import java.util.List;

/**
 * Created by Taras on 23.09.2015.
 */
public interface PlayerDao {
    Player findOne(Long id);

    List<Player> findPlayersByTeam(String teamName);
}
