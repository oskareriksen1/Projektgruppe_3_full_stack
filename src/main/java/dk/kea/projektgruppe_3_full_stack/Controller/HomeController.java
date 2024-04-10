package dk.kea.projektgruppe_3_full_stack.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping("/loginside")
    public String loginside () {
        return "loginside";
    }

   @GetMapping ("/opretbruger")
    public String opretBruger () {
       return "OpretBruger";
   }

}
