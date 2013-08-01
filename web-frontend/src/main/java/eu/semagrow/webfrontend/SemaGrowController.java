package eu.semagrow.webfrontend;

import eu.semagrow.uppercase.Uppercase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/semagrow")
public class SemaGrowController {

    @Autowired
    public Uppercase uppercase;

    @RequestMapping(value="/uppercase", method = RequestMethod.GET)
    public ModelAndView toUppercase(@RequestParam String toUpperCase) {
        ModelAndView mav = new ModelAndView("semagrow");
        mav.addObject("message", uppercase.toUppercase(toUpperCase));
        return mav;
    }

}