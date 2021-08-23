package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Pieza;

public interface IPiezaDao extends JpaRepository<Pieza, Integer> {
	
	public List<Pieza> findByNombre(String nombre); //filtrar piezas por nombre

}
