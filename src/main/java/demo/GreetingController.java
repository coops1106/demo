package demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping(value = "/")
    public String getDefault() {
        return "index";
    }

    @RequestMapping(value = "/greeting", method = {RequestMethod.GET})
    public String greetingGet(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greetingPage";
    }

    @RequestMapping(value = "/greeting", method = {RequestMethod.POST})
    public String greetingPost(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        return "redirect:greeting?name=" + name;
    }
}
