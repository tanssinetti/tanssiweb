package fi.tanssinetti.www.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hannu Lohtander on 24.9.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"", "/", "/home"})
    public String index() {
        return "home";
    }

}
