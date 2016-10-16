package fi.tanssinetti.www.api.controller.dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Hannu Lohtander on 8.10.2016.
 */
@Controller
@RequestMapping("/dev")
public class LayoutCtrl {

    @RequestMapping("/layout")
    public String layout(Model model) {

        return "index";
    }

    @RequestMapping("/about")
    public String aboutus() {
        return "aboutus";
    }

}
