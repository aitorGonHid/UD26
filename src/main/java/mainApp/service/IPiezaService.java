package mainApp.service;

import java.util.List;

import mainApp.dto.Pieza;

public interface IPiezaService {
	
	//Metodos del crud
	public List<Pieza> listarPiezas();
	
	public Pieza guardarPieza(Pieza pieza);
	
	public Pieza piezaXID(int id);
	
	public Pieza actualizarPieza(Pieza pieza);
	
	public void eliminarPieza(int id);
	
	public List<Pieza> listarXNombre(String nombre);
	
}
