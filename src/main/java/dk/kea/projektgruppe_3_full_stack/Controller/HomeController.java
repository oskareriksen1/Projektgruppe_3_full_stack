package dk.kea.projektgruppe_3_full_stack.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
    @GetMapping("/loginside")
    public String loginside () {
        return "loginside";
    }

    @GetMapping ("/opretoenske")
    public String opretoenske () {
        return "opretoenske";
    }



   @GetMapping ("/opretbruger")
    public String opretBruger () {
       return "OpretBruger";
   }
   @GetMapping ("/ønskelisten")
    public String Ønskelisten () {
        return "Ønskeliste";
   }
}
