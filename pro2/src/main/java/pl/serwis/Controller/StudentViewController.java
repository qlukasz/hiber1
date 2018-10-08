package pl.serwis.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.serwis.Entity.Student;
import pl.serwis.Service.StudentService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentViewController {
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/ss")
    public String foo(Model model){
        System.out.println("----- @GetMapping(value = \"/ss\")");
        model.addAttribute("imie", "Janusz");
        List<Student> students = new ArrayList<>(studentService.getAllStudents());
        model.addAttribute("students", students);
        return "index";
    }
}
