package dk.kea.projektgruppe_3_full_stack.Controller;

import dk.kea.projektgruppe_3_full_stack.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/opretbruger")
    public String showCreateUserForm() {
        return "opretBruger";
    }

    @PostMapping("/opretbruger")
    public String createUser (@ModelAttribute User user) {
        return "redirect:/";
    }
}
