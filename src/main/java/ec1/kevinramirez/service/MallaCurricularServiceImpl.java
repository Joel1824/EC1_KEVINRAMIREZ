package ec1.kevinramirez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec1.kevinramirez.model.MallaCurricular;
import ec1.kevinramirez.repository.MallaCurricularRepository;

@Service
public class MallaCurricularServiceImpl implements MallaCurricularService {

	@Autowired
	private MallaCurricularRepository repositorio;
	
	
	@Override
	public void guardar(MallaCurricular mallacurricular) {
		repositorio.save(mallacurricular);

	}

	@Override
	public void actualizar(MallaCurricular mallacurricular) {
		repositorio.saveAndFlush(mallacurricular);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<MallaCurricular> listar() {
		
		return repositorio.findAll();
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		
		return repositorio.findById(id).orElse(null);
	}

}
