package kuziv.jpa;

import kuziv.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Taras on 24.09.2015.
 */
public interface TeamRepository extends JpaRepository<Team, Long> {
    Team findByName(String name);
}
