package dk.kea.projektgruppe_3_full_stack.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

   @GetMapping ("/opretbruger")
    public String opretBruger () {
       return "OpretBruger";
   }

}
