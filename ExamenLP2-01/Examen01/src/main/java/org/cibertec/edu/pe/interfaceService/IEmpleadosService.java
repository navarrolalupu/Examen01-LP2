package org.cibertec.edu.pe.interfaceService;

import java.util.List;

import org.cibertec.edu.pe.modelo.Empleados;

public interface IEmpleadosService {
	public List<Empleados> Listado();
	void guardarEmpleado(Empleados empleado);
}
