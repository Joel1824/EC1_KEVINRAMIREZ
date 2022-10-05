package ec1.kevinramirez.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cursos")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCurso;
	private String curso;
	private String descripcion;
	
	@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinTable(
			name="cursos_profesor",
			joinColumns = @JoinColumn(
					name="id_curso",
					nullable=false,
					unique = true,
					foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_curso) references cursos(id_curso)")
					), inverseJoinColumns = @JoinColumn(
							name="id_profesor",
							nullable = false,
							unique = true,
							foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_profesor) references profesores(id_profesor)")
					)
			)
			
	
			
	
	@ManyToOne
	@JoinColumn(
			name="id_malla",
			nullable = false,
			unique = true,
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key (id_malla) references malla(id_malla)"))
	private MallaCurricular malla;
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
