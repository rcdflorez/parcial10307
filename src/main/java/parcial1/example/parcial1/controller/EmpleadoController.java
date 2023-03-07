package parcial1.example.parcial1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import parcial1.example.parcial1.model.Empleado;

import java.util.List;

public class EmpleadoController {

    @GetMapping("/getEmpleado")
    public String mostrarFormulario(Model modelo) {
        modelo.addAttribute("empleado", new Empleado());
        return "empleado";
    }


    @PostMapping("/postEmpleado")
    public String enviarFormulario(@ModelAttribute("empleado") Empleado empleado, BindingResult resultado) {
        if (resultado.hasErrors()) {
            return "empleado";
        }
        return "resultado";
    }
}
