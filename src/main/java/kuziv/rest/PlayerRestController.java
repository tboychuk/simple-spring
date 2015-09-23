package kuziv.rest;

import kuziv.entity.Player;
import kuziv.jpa.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Taras on 23.09.2015.
 */
@RestController
@RequestMapping("/players")
public class PlayerRestController {
    @Autowired
    private PlayerRepository repository;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Player getPlayer(@PathVariable Long id) {
        return repository.findOne(id);
    }

    @RequestMapping(value = "/salary/{s}", method = RequestMethod.GET)
    public Player getPlayerByS(@PathVariable Double s) {
        return repository.findBySalary(s);
    }


    @RequestMapping(value = "/team/{name}", method = RequestMethod.GET)
    public List<Player> getPlayer(@PathVariable String name) {
        return repository.findByTeamName(name);
    }
}
