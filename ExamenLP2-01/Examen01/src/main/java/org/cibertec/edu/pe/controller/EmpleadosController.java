package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.modelo.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmpleadosController {
	
	//METODO LISTADO
	@Autowired
	private IEmpleadosService s;
	
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Empleados> LEmpleados = s.Listado();
		m.addAttribute("listEmpl",LEmpleados);
		return "Index";
	}
	//registro
	@GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("empleado", new Empleados()); 
        return "registrar";
    }

	//METODO REGISTRO
	@PostMapping("/guardar")
    public String registrar(@ModelAttribute Empleados empleado) {

        s.guardarEmpleado(empleado);
        return "redirect:/listar"; 
    }
	
}
