package ec1.kevinramirez.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ec1.kevinramirez.model.Universidad;
import ec1.kevinramirez.repository.UniversidadRepository;

@Service
public class UniversidadServiceImpl implements UniversidadService {

	private UniversidadRepository repositorio;
	
	@Override
	public void guardar(Universidad universidad) {
		repositorio.save(universidad);

	}

	@Override
	public void actualizar(Universidad universidad) {
		repositorio.saveAndFlush(universidad);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Universidad> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public Universidad obtener(Integer id) {
		
		return repositorio.findById(id).orElse(null);
	}

}
