package kuziv.dao;

import kuziv.entity.Player;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.util.List;

/**
 * Created by Taras on 23.09.2015.
 */
@Repository
@Transactional
public class JpaPlayerDao implements PlayerDao {
    @PersistenceContext
    EntityManager em;

    @Override
    public Player findOne(Long id) {
        return em.find(Player.class, id);
    }

    @Override
    public List<Player> findPlayersByTeam(String teamName) {
        return em.createQuery("select p from Player p inner join fetch p.team where p.team.name=:teamName", Player.class).setParameter("teamName", teamName).getResultList();
    }
}
