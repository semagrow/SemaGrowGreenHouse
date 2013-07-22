package eu.semagrow.webfrontend;

import eu.semagrow.uppercase.Uppercase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/semagrow")
public class SemaGrowController {

    @Autowired
    public Uppercase uppercase;

    @RequestMapping(method = RequestMethod.GET)
    public String toUppercase(ModelMap model) {
        model.addAttribute("message", uppercase.toUppercase("Spring MVC Hello World"));
        return "semagrow";
    }

}