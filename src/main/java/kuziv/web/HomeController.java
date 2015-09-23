package kuziv.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Taras on 23.09.2015.
 */
@Controller
@RequestMapping(value = {"/", "home"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }
}
