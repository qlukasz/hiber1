package pl.serwis.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentViewController {
//    AaassAAAAaaaAAA
    @GetMapping(value = "/studentsview")
    public String foo(Model model){
        System.out.println("siema");
        System.out.println("siema");
        System.out.println("siema");
        System.out.println("siema");
        System.out.println("siema");
        model.addAttribute("imie", "Janusz");
        return "index";
    }
}
