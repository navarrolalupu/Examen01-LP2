package org.cibertec.edu.pe.services;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IEmpleadosService;
import org.cibertec.edu.pe.interfaces.IEmpleados;
import org.cibertec.edu.pe.modelo.Empleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadosService implements IEmpleadosService {

	@Autowired
	private IEmpleados e;
	
	@Override
	public List<Empleados> Listado() {
		return (List<Empleados>)e.findAll();
		
	}
	
	@Override
	public void guardarEmpleado(Empleados empleado) {
		
		e.save(empleado);
	}

}
