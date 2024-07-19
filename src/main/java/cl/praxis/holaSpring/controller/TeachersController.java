package cl.praxis.holaSpring.controller;


import cl.praxis.holaSpring.controller.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/teachers")
public class TeachersController {

    @GetMapping
    public String teachers(Model model) {

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Pamela", "Juarez", "Matematicas"));
        teachers.add(new Teacher(2, "Perico", "Perez", "Fisica"));
        teachers.add(new Teacher(3, "Paloma", "Silva", "Lenguaje"));
        model.addAttribute("teachers", teachers);
        return "teachers";
    }

    @GetMapping("/{id}")
    public String getOne(@PathVariable("id") int id,Model model) {
        Teacher t = new Teacher(id,"Ernesto","Diaz","Quimica");

        model.addAttribute("teacher",t);
        return "teacherDetails";
    }
}
