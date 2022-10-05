package ec1.kevinramirez.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec1.kevinramirez.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

}
