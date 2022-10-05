package ec1.kevinramirez.service;

import java.util.List;

import ec1.kevinramirez.model.Profesor;

public interface ProfesorService {
	
	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar(Integer id);
	List<Profesor> listar();
	Profesor obtener (Integer id);

}
