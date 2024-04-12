package dk.kea.projektgruppe_3_full_stack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIcontroller {

}
@GetMapping("/Forside")
public String visForside() { return "Forside";}

