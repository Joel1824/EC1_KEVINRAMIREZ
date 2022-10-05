package ec1.kevinramirez.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec1.kevinramirez.model.MallaCurricular;
import ec1.kevinramirez.service.MallaCurricularService;

@RestController
@RequestMapping("/mallacurricular/j1")
public class MallaCurricularController {
	
	
	@Autowired
	private MallaCurricularService service;
	
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<MallaCurricular>>listar(){
		return new ResponseEntity<List<MallaCurricular>>(service.listar(),HttpStatus.OK);
	}
	
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody MallaCurricular mallacurricular){
		service.guardar(mallacurricular);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<MallaCurricular> obtenerPorId(@PathVariable Integer id){
		
		MallaCurricular mallacurricular = service.obtener(id);
		
		if( mallacurricular != null) {
			return new ResponseEntity<MallaCurricular>(mallacurricular, HttpStatus.OK);
		}else {
			return new ResponseEntity<MallaCurricular>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody MallaCurricular mallacurricular){
		
		MallaCurricular malla = service.obtener(mallacurricular.getIdMalla());
		
		if(malla != null) {
			service.actualizar(mallacurricular);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
	}




	@RequestMapping(path = "/eliminar/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void>eliminar(@PathVariable Integer id){
		
		MallaCurricular mallacurricular = service.obtener(id);
		
		if(mallacurricular != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		
		
	}

}
