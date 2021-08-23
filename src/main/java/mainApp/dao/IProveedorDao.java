package mainApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Integer> {

		public List<Proveedor> findByNombre(String nombre); //filtrar proveedores por nombre
		
}
