package fi.tanssinetti.www.api.facade;

import org.springframework.stereotype.Component;

/**
 * Created by Hannu Lohtander on 24.9.2016.
 */
@Component
public class HelloFacade {

    public String getHello() {
        return "Hello!";
    }

}
