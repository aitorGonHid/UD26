package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.SuministraPieza;

public interface ISuministraPiezaDao extends JpaRepository<SuministraPieza, Integer> {

}
