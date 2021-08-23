package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Proveedor;
import mainApp.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedor guardarProveedor(@RequestBody Proveedor proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name="id") int id) {
		
		Proveedor proveedorXID= new Proveedor();
		
		proveedorXID=proveedorServiceImpl.proveedorXID(id);
		
		System.out.println("Proveedor con ID: "+proveedorXID);
		
		return proveedorXID;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")int id,@RequestBody Proveedor proveedor) {
		
		Proveedor proveedor_seleccionado = new Proveedor();
		Proveedor proveedor_actualizado = new Proveedor();
		
		proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		proveedor_seleccionado.setNombre(proveedor.getNombre());
		
		proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(proveedor_seleccionado);
		
		System.out.println("Proveedor actualizado: "+ proveedor_actualizado);
		
		return proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name="id")int id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
}
