package cl.praxis.holaSpring.controller;

import cl.praxis.holaSpring.controller.model.Estudiante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")

public class InitController {

    @GetMapping
    public String init(Model model){

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante(1,"Pepe","Ito"));
        estudiantes.add(new Estudiante(2,"Luzo","Ito"));
        estudiantes.add(new Estudiante(3,"Maria","Perez"));

        model.addAttribute("estudiantes",estudiantes);
        return "index";
    }
}
