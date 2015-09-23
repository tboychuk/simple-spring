package kuziv.jpa;

import kuziv.config.JpaConfig;
import kuziv.dao.PlayerDao;
import kuziv.entity.Player;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Taras on 23.09.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaConfig.class)
public class PlayerDaoTest {

    @Autowired
    PlayerDao dao;


    @Test
    @Transactional
    public void findPlayersByTeam() {
        List<Player> players = dao.findPlayersByTeam("Barcelona");
        assertEquals(players.size(), 2);
    }

}
