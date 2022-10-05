package ec1.kevinramirez.service;

import java.util.List;

import ec1.kevinramirez.model.Universidad;

public interface UniversidadService {
	
	void guardar(Universidad universidad);
	void actualizar(Universidad universidad);
	void eliminar (Integer id);
	List<Universidad>listar();
	Universidad obtener (Integer id);
	

}
