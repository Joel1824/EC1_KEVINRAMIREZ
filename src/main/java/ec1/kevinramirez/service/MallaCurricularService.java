package ec1.kevinramirez.service;

import java.util.List;

import ec1.kevinramirez.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardar(MallaCurricular mallacurricular);
	void actualizar(MallaCurricular mallacurricular);
	void eliminar(Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);

}
