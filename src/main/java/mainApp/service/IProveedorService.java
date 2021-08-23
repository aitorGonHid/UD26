package mainApp.service;

import java.util.List;

import mainApp.dto.Proveedor;

public interface IProveedorService {
	
	//Metodos del crud
	public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedor(Proveedor proveedor);
	
	public Proveedor proveedorXID(int id);
	
	public Proveedor actualizarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(int id);
	
	public List<Proveedor> listarXNombre(String nombre);
	
}
