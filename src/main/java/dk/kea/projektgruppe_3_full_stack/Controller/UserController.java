package dk.kea.projektgruppe_3_full_stack.Controller;
/*
import dk.kea.projektgruppe_3_full_stack.Model.User;
import dk.kea.projektgruppe_3_full_stack.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/opretbruger")
    public String showCreateUserForm() {
        return "OpretBruger";
    }

    @PostMapping("/opretbruger")
    public String createUser (@ModelAttribute User user) {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "loginside";
    }

    @PostMapping("/login")
    public String login (@ModelAttribute User user) {
        if (userRepository.isValidUser(user.getUsername(), user.getPassword())) {
            return "redirect:/";
        } else {
            return "redirect:/login?error";
        }
    }
}
*/