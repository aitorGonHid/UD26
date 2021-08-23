package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.SuministraPieza;

public interface ISuministraPiezaDao extends JpaRepository<SuministraPieza, Integer> {
	
	public List<SuministraPieza> findByPrecio(Double precio);

}
