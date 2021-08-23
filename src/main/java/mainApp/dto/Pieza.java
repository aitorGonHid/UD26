package mainApp.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="piezas")
public class Pieza {
	
	//Atributos de entidad
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombre")
	private String nombre;
	//Referenciado en tabla intermedia suministra_pieza
	@OneToMany
	@JoinColumn(name="id")
	private List<SuministraPieza> suministraPieza;
	
	//Constructores
	public Pieza() {
		
	}
	/**
	 * @param id de la pieza
	 * @param nombre de la pieza
	 * @param suministraPieza atributo que representa la relacion entre pieza y proveedor
	 */
	public Pieza(int id, String nombre, List<SuministraPieza> suministraPieza) {
		this.id = id;
		this.nombre = nombre;
		this.suministraPieza = suministraPieza;
	}
	
	//Getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "SuministraPieza")
	public List<SuministraPieza> getSuministraPieza() {
		return suministraPieza;
	}
	public void setSuministraPieza(List<SuministraPieza> suministraPieza) {
		this.suministraPieza = suministraPieza;
	}
}
