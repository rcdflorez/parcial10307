package parcial1.example.parcial1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Parcial 1 Apps Empresariales");
        return "empleado/index";
    }

}
