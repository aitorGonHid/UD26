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

import mainApp.dto.Pieza;
import mainApp.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {
	
	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Pieza> listarPiezas(){
		return piezaServiceImpl.listarPiezas();
	}


	@PostMapping("/piezas")
	public Pieza guardarPieza(@RequestBody Pieza pieza) {
		
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	
	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name="id") int id) {
		
		Pieza piezaXID= new Pieza();
		
		piezaXID=piezaServiceImpl.piezaXID(id);
		
		System.out.println("Pieza con ID: "+piezaXID);
		
		return piezaXID;
	}
	
	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name="id")int id,@RequestBody Pieza pieza) {
		
		Pieza pieza_seleccionada = new Pieza();
		Pieza pieza_actualizada= new Pieza();
		
		pieza_seleccionada= piezaServiceImpl.piezaXID(id);
		
		pieza_seleccionada.setNombre(pieza.getNombre());
		
		pieza_actualizada = piezaServiceImpl.actualizarPieza(pieza_seleccionada);
		
		System.out.println("Pieza actualizada: "+ pieza_actualizada);
		
		return pieza_actualizada;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPieza(@PathVariable(name="id")int id) {
		piezaServiceImpl.eliminarPieza(id);
	}
	
	@GetMapping("/piezas/nombre/{nombre}")
	public List<Pieza> listarXNombre(@PathVariable(name="nombre")String nombre) {
		return piezaServiceImpl.listarXNombre(nombre);
	}
}
