package rikkeiAcademy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Greeting {
    @GetMapping("/greeting")
    public String greeting(){
        return "home";
    }
}
