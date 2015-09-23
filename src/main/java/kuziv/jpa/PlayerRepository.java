package kuziv.jpa;

import kuziv.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Taras on 23.09.2015.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByFirstName(String firstName);
    Player findBySalary(Double salary);
    List<Player> findByTeamName(String teamName);

}
