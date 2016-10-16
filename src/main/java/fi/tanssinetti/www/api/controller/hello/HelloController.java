package fi.tanssinetti.www.api.controller.hello;

import fi.tanssinetti.www.api.facade.HelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Hannu Lohtander on 24.9.2016.
 */

@RequestMapping("/hello")
@RestController
public class HelloController {

    @Autowired
    HelloFacade helloFacade;

    @RequestMapping("/say")
    public String hello() {
        return helloFacade.getHello();
    }

}
