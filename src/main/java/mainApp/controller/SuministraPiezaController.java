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

import mainApp.dto.SuministraPieza;
import mainApp.service.SuministraPiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraPiezaController {
	
	@Autowired
	SuministraPiezaServiceImpl suminstraPiezaServiceImpl;
	 
	@GetMapping("/suministraPieza")
	public List<SuministraPieza> listarSuministraPieza(){
		return suminstraPiezaServiceImpl.listarSuministraPieza();
	}
	 
	@PostMapping("/suministraPieza")
	public SuministraPieza guardarSuministraPieza(@RequestBody SuministraPieza suministraPieza) {
			
		return suminstraPiezaServiceImpl.guardarSuministraPieza(suministraPieza);
	}
	
	@GetMapping("/suministraPieza/{id}")
	public SuministraPieza suministraPiezaXID(@PathVariable(name="id") int id) {
		
		SuministraPieza suministraPiezaXID= new SuministraPieza();
		
		suministraPiezaXID = suminstraPiezaServiceImpl.suministraPiezaXID(id);
		
		System.out.println("SuminstraPieza con ID: "+suministraPiezaXID);
		
		return suministraPiezaXID;
	}
	
	@PutMapping("/suministraPieza/{id}")
	public SuministraPieza actualizarSuministraPieza(@PathVariable(name="id")int id,@RequestBody SuministraPieza suministraPieza) {
		
		SuministraPieza suministraPieza_seleccionado = new SuministraPieza();
		SuministraPieza suministraPieza_actualizado = new SuministraPieza();
		
		suministraPieza_seleccionado= suminstraPiezaServiceImpl.suministraPiezaXID(id);

		suministraPieza_seleccionado.setPieza(suministraPieza.getPieza());
		suministraPieza_seleccionado.setProveedor(suministraPieza.getProveedor());
		suministraPieza_seleccionado.setPrecio(suministraPieza.getPrecio());
		
		suministraPieza_actualizado = suminstraPiezaServiceImpl.actualizarSuministraPieza(suministraPieza_seleccionado);
		
		System.out.println("SuministraPieza actualizado: "+ suministraPieza_actualizado);
		
		return suministraPieza_actualizado;
	}
	
	@DeleteMapping("/suministraPieza/{id}")
	public void eliminarSuministraPieza(@PathVariable(name="id")int id) {
		suminstraPiezaServiceImpl.eliminarSuministraPieza(id);
	}
	
	@GetMapping("/suministraPieza/precio/{precio}")
	public List<SuministraPieza> listarXPrecio(@PathVariable(name="precio")double precio) {
		return suminstraPiezaServiceImpl.listarXPrecio(precio);
	}
}
