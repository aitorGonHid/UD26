package mainApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Integer> {

}
