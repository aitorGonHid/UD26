package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Pieza;

public interface IPiezaDao extends JpaRepository<Pieza, Integer> {

}
